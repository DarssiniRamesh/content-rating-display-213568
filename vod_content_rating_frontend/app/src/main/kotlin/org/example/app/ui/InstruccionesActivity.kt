package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import org.example.app.R
import org.example.app.data.AcknowledgementStore

/**
 * PUBLIC_INTERFACE
 * InstruccionesActivity shows the instructions and rating details.
 *
 * Parameters (Intent extras):
 *  - EXTRA_CONTENT_ID: String identifier of the content/prototype.
 *
 * Behavior:
 *  - User must acknowledge reading the instructions to proceed.
 *  - On proceed, stores acknowledgment for the session and navigates to PlaybackActivity.
 *
 * Returns:
 *  - No explicit result. Launches PlaybackActivity after acknowledgment.
 */
class InstruccionesActivity : Activity() {

    private fun updateProceedEnabled(button: Button, enabled: Boolean) {
        button.alpha = if (enabled) 1.0f else 0.6f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones)

        val contentId = intent.getStringExtra(EXTRA_CONTENT_ID) ?: ""

        val header: TextView = findViewById(R.id.instruccionesHeader)
        val ratingTitle: TextView = findViewById(R.id.ratingTitle)
        val ratingDesc: TextView = findViewById(R.id.ratingDescription)
        val steps: TextView = findViewById(R.id.instruccionesSteps)
        val acknowledge: CheckBox = findViewById(R.id.checkboxAcknowledge)
        val proceed: Button = findViewById(R.id.buttonProceed)

        header.text = getString(R.string.instrucciones_howto)
        ratingTitle.text = getString(R.string.rating_title)
        ratingDesc.text = getString(R.string.rating_description)
        steps.text = getString(R.string.instrucciones_steps)
        acknowledge.text = getString(R.string.instrucciones_acknowledge)
        proceed.text = getString(R.string.instrucciones_proceed)

        proceed.contentDescription = getString(R.string.instrucciones_ack_hint)

        // initial visual state (not strictly disabled; enforced via Toast, but update color hint)
        updateProceedEnabled(proceed, acknowledge.isChecked)
        acknowledge.setOnCheckedChangeListener { _, isChecked ->
            updateProceedEnabled(proceed, isChecked)
        }

        proceed.setOnClickListener {
            if (contentId.isBlank()) {
                Toast.makeText(this, getString(R.string.error_missing_content), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (!acknowledge.isChecked) {
                Toast.makeText(this, getString(R.string.instrucciones_ack_hint), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            AcknowledgementStore.setAcknowledged(contentId, true)
            val playback = Intent(this, PlaybackActivity::class.java).apply {
                putExtra(PlaybackActivity.EXTRA_CONTENT_ID, contentId)
            }
            startActivity(playback)
            finish()
        }
    }

    companion object {
        const val EXTRA_CONTENT_ID = "extra_content_id"
    }
}
