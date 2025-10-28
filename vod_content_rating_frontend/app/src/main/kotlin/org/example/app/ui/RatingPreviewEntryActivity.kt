package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R
import org.example.app.data.RatingInfo
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * RatingPreviewEntryActivity
 *
 * Developer/preview helper that immediately launches the rating screen
 * with a seeded RatingInfo model. Useful for quick smoke checks.
 */
class RatingPreviewEntryActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)

        val info = RatingInfo(
            title = "Preview Entry Film",
            ratingCode = "TV-MA",
            ratingLabel = "Mature Audiences Only",
            advisory = "Intense sequences of violence and language throughout.",
            descriptors = listOf("Violence", "Language", "Smoking"),
            requireCountdown = true,
            countdownSeconds = 3
        )
        startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra(IntentKeys.EXTRA_RATING_INFO, info)
        })
        finish()
    }
}
