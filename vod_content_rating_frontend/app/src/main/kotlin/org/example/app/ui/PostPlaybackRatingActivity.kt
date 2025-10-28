package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import org.example.app.R
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * PostPlaybackRatingActivity renders the rating experience with optional countdown.
 */
class PostPlaybackRatingActivity : AppCompatActivity() {

    private var timer: CountDownTimer? = null

    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_post_playback_rating)

        val titleView = findViewById<TextView>(R.id.contentTitle)
        val inviteView = findViewById<TextView>(R.id.invitationCopy)
        val icon = findViewById<ImageView>(R.id.ratingIcon)
        val close = findViewById<MaterialButton>(R.id.buttonClose)
        val card = findViewById<LinearLayout>(R.id.foregroundCard)
        val countdownRow = findViewById<LinearLayout>(R.id.countdownRow)
        val countdownText = findViewById<TextView>(R.id.countdownText)

        // Dynamic elements inserted after invite
        val codeLabelView = TextView(this).apply {
            id = View.generateViewId()
            setTextColor(resources.getColor(R.color.eg_surface, theme))
            setPadding(12, 8, 12, 8)
            setBackgroundColor(resources.getColor(R.color.eg_primary, theme))
        }
        val advisoryView = TextView(this).apply {
            id = View.generateViewId()
            setTextColor(resources.getColor(R.color.eg_text, theme))
        }
        val descHeader = TextView(this).apply {
            id = View.generateViewId()
            setTextColor(resources.getColor(R.color.eg_secondary, theme))
            text = getString(R.string.rating_descriptors_header)
        }
        val descList = LinearLayout(this).apply {
            id = View.generateViewId()
            orientation = LinearLayout.VERTICAL
        }

        val insertIndex = (card.indexOfChild(inviteView) + 1).coerceAtLeast(1)
        card.addView(codeLabelView, insertIndex)
        card.addView(advisoryView, insertIndex + 1)
        card.addView(descHeader, insertIndex + 2)
        card.addView(descList, insertIndex + 3)

        val model: RatingInfo? = intent.getParcelableExtra("EXTRA_RATING_INFO")

        val resolvedTitle = when {
            model?.title == null -> getString(R.string.rating_title_missing_key)
            model.title.isNullOrEmpty() -> ""
            else -> model.title
        }
        titleView.text = if (resolvedTitle.isEmpty()) getString(R.string.rating_title) else resolvedTitle
        icon.contentDescription = getString(R.string.content_rating_icon)

        val code = model?.ratingCode.orEmpty()
        val label = model?.ratingLabel.orEmpty()
        val codeLabel = when {
            code.isNotBlank() && label.isNotBlank() -> "$code • $label"
            code.isNotBlank() -> code
            label.isNotBlank() -> label
            else -> getString(R.string.rating_badge_placeholder)
        }
        codeLabelView.text = codeLabel

        val adv = when {
            model?.advisory == null -> getString(R.string.rating_description_missing_key)
            model.advisory.isEmpty() -> ""
            else -> model.advisory
        }
        advisoryView.text = adv

        val descriptors = model?.descriptors.orEmpty()
        if (descriptors.isEmpty()) {
            descHeader.visibility = View.GONE
            descList.visibility = View.GONE
        } else {
            descHeader.visibility = View.VISIBLE
            descList.visibility = View.VISIBLE
            descList.removeAllViews()
            descriptors.forEach { d ->
                val tv = TextView(this).apply {
                    text = "• $d"
                    setTextColor(resources.getColor(R.color.eg_text, theme))
                }
                descList.addView(tv)
            }
        }

        close.text = getString(R.string.rating_acknowledge_cta)

        val requireCountdown = model?.requireCountdown == true
        val seconds = (model?.countdownSeconds ?: 0).coerceIn(0, 60)
        if (requireCountdown && seconds > 0) {
            close.isEnabled = false
            countdownRow.visibility = View.VISIBLE
            startCountdown(seconds, countdownText) {
                close.isEnabled = true
            }
        } else {
            countdownRow.visibility = View.GONE
            close.isEnabled = true
        }

        close.setOnClickListener {
            try {
                startActivity(Intent(this, PlaybackActivity::class.java))
            } catch (_: Throwable) {
                // fallback
            }
            finish()
        }
    }

    private fun startCountdown(totalSeconds: Int, textView: TextView, onDone: () -> Unit) {
        textView.text = getString(R.string.rating_countdown_format, totalSeconds)
        timer?.cancel()
        timer = object : CountDownTimer(totalSeconds * 1000L, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                val s = (millisUntilFinished / 1000L).toInt()
                textView.text = getString(R.string.rating_countdown_format, s)
            }
            override fun onFinish() {
                textView.text = getString(R.string.rating_countdown_format, 0)
                onDone()
            }
        }.start()
    }

    override fun onDestroy() {
        timer?.cancel()
        timer = null
        super.onDestroy()
    }
}
