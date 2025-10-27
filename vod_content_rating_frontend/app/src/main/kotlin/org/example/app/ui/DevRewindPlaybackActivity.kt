package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * DevRewindPlaybackActivity simulates rewinding before credits and relaunching playback.
 */
class DevRewindPlaybackActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentId = intent.getStringExtra(IntentKeys.EXTRA_CONTENT_ID) ?: "prototype_1"
        val i = Intent(this, PlaybackActivity::class.java).apply {
            putExtra(IntentKeys.EXTRA_CONTENT_ID, contentId)
        }
        startActivity(i)
        finish()
    }
}
