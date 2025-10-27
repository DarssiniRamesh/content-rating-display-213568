package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.example.app.R
import org.example.app.data.AcknowledgementStore
import org.example.app.data.Defaults
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * PlaybackActivity acts as a placeholder for media playback.
 * Displays whether the current contentId was acknowledged before entering.
 * Params:
 *  - EXTRA_CONTENT_ID: String
 */
class PlaybackActivity : Activity() {
    private var simulatedPlaybackPosSec: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playback)

        val contentId = intent.getStringExtra(EXTRA_CONTENT_ID) ?: ""
        val info: TextView = findViewById(R.id.playbackInfo)
        val acknowledged = if (contentId.isNotBlank() && AcknowledgementStore.isAcknowledged(contentId)) "✓" else "✗"
        info.text = PlaybackInfoUtils.formatInfo(
            this,
            getString(R.string.title_playback),
            " • ",
            getString(R.string.playback_ack_label),
            acknowledged
        )

        // For preview: simulate reaching credits and show rating screen
        info.postDelayed({
            simulatedPlaybackPosSec = Defaults.DEFAULT_ROLLING_CREDITS_SEC
            startRating(
                contentId,
                displayTimeSec = Defaults.DEFAULT_DISPLAY_TIME_SEC,
                playbackPos = simulatedPlaybackPosSec,
                rollingCredits = Defaults.DEFAULT_ROLLING_CREDITS_SEC
            )
        }, 1500)

        // QA button to open rating immediately
        findViewById<Button>(R.id.buttonShowRating)?.setOnClickListener {
            startRating(
                contentId = contentId,
                displayTimeSec = Defaults.DEFAULT_DISPLAY_TIME_SEC,
                playbackPos = Defaults.DEFAULT_ROLLING_CREDITS_SEC,
                rollingCredits = Defaults.DEFAULT_ROLLING_CREDITS_SEC
            )
        }
    }

    private fun startRating(contentId: String, displayTimeSec: Int, playbackPos: Int, rollingCredits: Int) {
        val i = Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra(IntentKeys.EXTRA_CONTENT_ID, contentId)
            putExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, displayTimeSec)
            putExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, playbackPos)
            putExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, rollingCredits)
        }
        startActivity(i)
    }

    companion object {
        const val EXTRA_CONTENT_ID = IntentKeys.EXTRA_CONTENT_ID
    }
}
