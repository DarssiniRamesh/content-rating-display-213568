package org.example.app.ui

import android.view.View
import android.widget.Button
import android.content.Intent

/**
 * PUBLIC_INTERFACE
 * QuickLaunch wires a button to start PlaybackActivity with a constant contentId.
 * Use from IndiceActivity to ensure a single-tap entry into the flow for validation.
 */
object QuickLaunch {
    // PUBLIC_INTERFACE
    fun attach(button: Button, host: android.app.Activity) {
        button.setOnClickListener { _: View ->
            val intent = Intent(host, PlaybackActivity::class.java).apply {
                putExtra(PlaybackActivity.EXTRA_CONTENT_ID, "prototype_1")
            }
            host.startActivity(intent)
        }
    }
}
