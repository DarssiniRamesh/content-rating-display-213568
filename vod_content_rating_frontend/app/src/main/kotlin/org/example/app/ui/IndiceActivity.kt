package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import org.example.app.R
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * ÍndiceActivity is the launcher/entry screen for previews.
 */
class IndiceActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: android.view.Menu): Boolean {
        menuInflater.inflate(R.menu.menu_indice, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_start_playback -> {
                startActivity(android.content.Intent(this, PlaybackActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_indice)

        // Proceed to Instrucciones by tapping the title
        findViewById<android.view.View?>(R.id.indiceTitle)?.setOnClickListener {
            startActivity(Intent(this, InstruccionesActivity::class.java))
        }

        // QA: Start Rating preview
        findViewById<MaterialButton?>(R.id.buttonOpenRatingQA)?.setOnClickListener {
            val model = RatingInfo(
                title = getString(R.string.vod_title_placeholder),
                ratingCode = getString(R.string.rating_label_pg13),
                ratingLabel = "Parents Strongly Cautioned",
                advisory = getString(R.string.rating_description_pg13),
                descriptors = listOf("Violence", "Language"),
                requireCountdown = true,
                countdownSeconds = 3
            )
            startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
                putExtra("EXTRA_RATING_INFO", model)
            })
        }
    }
}
