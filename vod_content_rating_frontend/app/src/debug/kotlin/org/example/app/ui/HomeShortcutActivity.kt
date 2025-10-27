/**
 * PUBLIC_INTERFACE
 * HomeShortcutActivity is a debug-only launcher to validate the Post-Playback Rating screen quickly.
 * It immediately starts PlaybackActivity with a known contentId.
 */
package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class HomeShortcutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, PlaybackActivity::class.java).apply {
            putExtra(PlaybackActivity.EXTRA_CONTENT_ID, "prototype_1")
        })
        finish()
    }
}
