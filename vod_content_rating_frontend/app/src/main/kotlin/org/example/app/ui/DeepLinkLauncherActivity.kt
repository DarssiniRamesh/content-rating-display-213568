package org.example.app.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * DeepLinkLauncherActivity handles app://rating/show and forwards to rating with sample parameters.
 */
class DeepLinkLauncherActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val uri: Uri? = intent?.data
        if (uri?.scheme == "app" && uri.host == "rating" && uri.path == "/show") {
            val model = RatingInfo(
                title = "Executive Thriller",
                ratingCode = "TV-MA",
                ratingLabel = "Mature Audiences Only",
                advisory = "Intense sequences of violence and language throughout.",
                descriptors = listOf("Violence", "Language", "Smoking"),
                requireCountdown = true,
                countdownSeconds = 3
            )
            startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
                putExtra("EXTRA_RATING_INFO", model)
            })
        }
        finish()
    }
}
