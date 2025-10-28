package org.example.app.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * DeepLinkPostplayAliasActivity
 *
 * Handles app://rating/postplay and forwards to rating with seeded data.
 */
class DeepLinkPostplayAliasActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri: Uri? = intent?.data
        if (uri?.scheme == "app" && uri.host == "rating" && uri.path == "/postplay") {
            val model = RatingInfo(
                title = "Executive Preview",
                ratingCode = "PG-13",
                ratingLabel = "Parents Strongly Cautioned",
                advisory = "Some material may be inappropriate for children under 13.",
                descriptors = listOf("Violence"),
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
