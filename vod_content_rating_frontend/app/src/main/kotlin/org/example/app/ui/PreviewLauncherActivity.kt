package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * PreviewLauncherActivity
 *
 * Developer helper to immediately open the rating screen with a seeded RatingInfo.
 * Not linked from launcher; trigger via tools or internal navigation stubs.
 */
class PreviewLauncherActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val info = RatingInfo(
            title = "Preview Feature Film",
            ratingCode = "PG-13",
            ratingLabel = "Parents Strongly Cautioned",
            advisory = "Some material may be inappropriate for children under 13.",
            descriptors = listOf("Violence", "Language"),
            requireCountdown = true,
            countdownSeconds = 3
        )
        startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra(org.example.app.data.IntentKeys.EXTRA_RATING_INFO, info)
        })
        finish()
    }
}
