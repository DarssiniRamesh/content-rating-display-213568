package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * DevLaunchRatingActivity is a developer/QA helper screen that immediately launches
 * the PostPlaybackRatingActivity with deterministic extras, then finishes.
 */
class DevLaunchRatingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra(IntentKeys.EXTRA_CONTENT_ID, "prototype_1")
            putExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, 10)
            putExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, 3)
            putExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, 3)
        }
        startActivity(i)
        finish()
    }
}
