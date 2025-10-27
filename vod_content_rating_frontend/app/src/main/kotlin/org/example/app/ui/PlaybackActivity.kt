package org.example.app.ui

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import org.example.app.R
import org.example.app.data.AcknowledgementStore

/**
 * PUBLIC_INTERFACE
 * PlaybackActivity acts as a placeholder for media playback.
 * Displays whether the current contentId was acknowledged before entering.
 * Params:
 *  - EXTRA_CONTENT_ID: String
 */
class PlaybackActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playback)

        val contentId = intent.getStringExtra(EXTRA_CONTENT_ID) ?: ""
        val info: TextView = findViewById(R.id.playbackInfo)
        val acknowledged = if (contentId.isNotBlank() && AcknowledgementStore.isAcknowledged(contentId)) "✓" else "✗"
        info.text = getString(R.string.title_playback) + " • " + contentId + " • Ack: " + acknowledged
    }

    companion object {
        const val EXTRA_CONTENT_ID = "extra_content_id"
    }
}
