package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * SkipRatingActivity immediately routes user back to PlaybackActivity.
 * Useful as a fallback when rating should be skipped.
 */
class SkipRatingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentId = intent.getStringExtra(PlaybackActivity.EXTRA_CONTENT_ID) ?: ""
        val i = Intent(this, PlaybackActivity::class.java).apply {
            putExtra(PlaybackActivity.EXTRA_CONTENT_ID, contentId)
        }
        startActivity(i)
        finish()
    }
}
