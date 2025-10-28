package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * DevLaunchRatingActivity
 *
 * Quick developer launcher that opens the rating preview with sample parameters.
 */
class DevLaunchRatingActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model = RatingInfo(
            title = "Executive Action",
            ratingCode = "R",
            ratingLabel = "Restricted",
            advisory = "Strong violence and language.",
            descriptors = listOf("Violence", "Language"),
            requireCountdown = true,
            countdownSeconds = 3
        )
        startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra("EXTRA_RATING_INFO", model)
        })
        finish()
    }
}
