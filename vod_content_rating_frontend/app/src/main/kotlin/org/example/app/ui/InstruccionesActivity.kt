package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import org.example.app.R
import org.example.app.data.RatingInfo

/**
 * PUBLIC_INTERFACE
 * InstruccionesActivity shows a simple instruction and allows proceeding into the rating flow.
 */
class InstruccionesActivity : AppCompatActivity() {

    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_instrucciones)

        findViewById<MaterialButton?>(R.id.buttonProceed)?.setOnClickListener {
            val model = RatingInfo(
                title = "Executive Documentary",
                ratingCode = "TV-14",
                ratingLabel = "Parents Strongly Cautioned",
                advisory = "Some material may not be suited for children under 14.",
                descriptors = listOf("Thematic Elements"),
                requireCountdown = false,
                countdownSeconds = 0
            )
            startActivity(Intent(this, PostPlaybackRatingActivity::class.java).apply {
                putExtra("EXTRA_RATING_INFO", model)
            })
        }
    }
}
