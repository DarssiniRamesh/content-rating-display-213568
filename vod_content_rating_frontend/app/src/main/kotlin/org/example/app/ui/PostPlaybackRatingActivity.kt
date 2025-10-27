package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.example.app.R
import org.example.app.data.Defaults
import org.example.app.data.IntentKeys
import org.example.app.data.Repository

/**
 * PUBLIC_INTERFACE
 * PostPlaybackRatingActivity shows a PIP-style rating screen after playback reaches rolling credits.
 * Parameters via Intent extras:
 *  - extra_content_id: String (content id)
 *  - extra_display_time_sec: Int (max 60, default 10)
 *  - extra_playback_position_sec: Int (current playback position seconds)
 *  - extra_rolling_credits_sec: Int (threshold seconds when credits begin)
 *
 * Business behavior:
 *  - Skip if already rated (checked via Repository).
 *  - Do not show if playback closed before rolling credits threshold.
 *  - Auto-close after display_time.
 *  - If closed and the user rewinds before rolling credits, caller can relaunch to show again.
 *  - Routes back to full-screen PlaybackActivity; Vcard placeholder can be integrated later.
 *
 * Missing/empty keys handling:
 *  - If title/invitation metadata is missing, show the key name literal.
 *  - If empty, leave space while preserving layout.
 */
class PostPlaybackRatingActivity : Activity() {

    private lateinit var repository: Repository
    private var timer: CountDownTimer? = null

    private fun clampDisplayTime(sec: Int): Int {
        val s = if (sec <= 0) Defaults.DEFAULT_DISPLAY_TIME_SEC else sec
        return s.coerceAtMost(60)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        repository = Repository()

        val contentId = intent.getStringExtra(IntentKeys.EXTRA_CONTENT_ID) ?: ""

        // Skip invalid or already-rated cases
        if (contentId.isBlank() || repository.hasUserRated(contentId)) {
            finishToPlayback(contentId)
            return
        }

        val playbackPos = intent.getIntExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, 0)
        val creditsAt = intent.getIntExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, Defaults.DEFAULT_ROLLING_CREDITS_SEC)
        if (playbackPos < creditsAt) {
            finishToPlayback(contentId)
            return
        }

        setContentView(R.layout.activity_post_playback_rating)

        val content = repository.getContent(contentId)
        val metadata = repository.getMetadata(contentId)

        val posterBackground: ImageView = findViewById(R.id.posterBackground)
        val titleView: TextView = findViewById(R.id.contentTitle)
        val copyView: TextView = findViewById(R.id.invitationCopy)
        val countdownView: TextView = findViewById(R.id.countdownText)

        val btnLike: Button = findViewById(R.id.buttonLike)
        val btnLove: Button = findViewById(R.id.buttonLove)
        val btnDislike: Button = findViewById(R.id.buttonDislike)
        val btnClose: Button = findViewById(R.id.buttonClose)

        // Title presentation rules
        titleView.text = when (content.title) {
            null -> getString(R.string.rating_title_missing_key)
            else -> content.title
        }

        // Invitation copy rules
        copyView.text = when (metadata.invitationCopy) {
            null -> getString(R.string.rating_invite_missing_key)
            else -> metadata.invitationCopy
        }

        // Localize button labels
        btnLike.text = getString(R.string.rating_like)
        btnLove.text = getString(R.string.rating_love)
        btnDislike.text = getString(R.string.rating_dislike)
        btnClose.text = getString(R.string.rating_close)

        // Default D-pad focus on Close
        btnClose.isFocusable = true
        btnClose.requestFocus()

        // Wire actions
        btnLike.setOnClickListener { onRate(contentId, "like") }
        btnLove.setOnClickListener { onRate(contentId, "love") }
        btnDislike.setOnClickListener { onRate(contentId, "dislike") }
        btnClose.setOnClickListener { finishToPlayback(contentId) }

        // Start countdown (max 60s)
        val displayTime = clampDisplayTime(intent.getIntExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, Defaults.DEFAULT_DISPLAY_TIME_SEC))
        startCountdown(displayTime, countdownView) { finishToPlayback(contentId) }
    }

    override fun onDestroy() {
        super.onDestroy()
        timer?.cancel()
    }

    private fun onRate(contentId: String, rating: String) {
        repository.sendRating(contentId, rating)
        // For now, return to playback; Vcard integration can be hooked here.
        finishToPlayback(contentId)
    }

    private fun startCountdown(seconds: Int, view: TextView, onFinish: () -> Unit) {
        view.visibility = View.VISIBLE
        view.text = seconds.toString()
        timer?.cancel()
        timer = object : CountDownTimer(seconds * 1000L, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                val remain = (millisUntilFinished / 1000L).toInt()
                view.text = remain.toString()
            }

            override fun onFinish() {
                onFinish()
            }
        }.start()
    }

    private fun finishToPlayback(contentId: String) {
        val i = Intent(this, PlaybackActivity::class.java).apply {
            putExtra(PlaybackActivity.EXTRA_CONTENT_ID, contentId)
        }
        startActivity(i)
        finish()
    }
}
