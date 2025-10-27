package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * DeepLinkLauncherActivity parses a simple uri to start PostPlaybackRatingActivity:
 *  scheme: app, host: rating, path: /show?contentId=...&display=10
 */
class DeepLinkLauncherActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data: Uri? = intent?.data
        val contentId = data?.getQueryParameter("contentId") ?: "prototype_1"
        val display = data?.getQueryParameter("display")?.toIntOrNull() ?: 10
        val playbackPos = data?.getQueryParameter("pos")?.toIntOrNull() ?: 3
        val credits = data?.getQueryParameter("credits")?.toIntOrNull() ?: 3

        val i = Intent(this, PostPlaybackRatingActivity::class.java).apply {
            putExtra(IntentKeys.EXTRA_CONTENT_ID, contentId)
            putExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, display)
            putExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, playbackPos)
            putExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, credits)
        }
        startActivity(i)
        finish()
    }
}
