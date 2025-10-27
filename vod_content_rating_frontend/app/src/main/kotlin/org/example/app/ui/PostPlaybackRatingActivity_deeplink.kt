package org.example.app.ui

import android.app.Activity
import android.net.Uri
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * PostPlaybackDeeplinkResolver extracts or supplies default extras when launched via a deep link.
 */
object PostPlaybackDeeplinkResolver {

    // PUBLIC_INTERFACE
    fun resolveDefaultsIfMissing(activity: Activity) {
        val i = activity.intent ?: return
        val data: Uri? = i.data
        // If contentId is missing, and we have a matching deep link, set sane defaults.
        if (!i.hasExtra(IntentKeys.EXTRA_CONTENT_ID) && data != null) {
            val isPostPlay = (data.scheme == "app" && data.host == "rating" && data.path?.startsWith("/postplay") == true)
            if (isPostPlay) {
                i.putExtra(IntentKeys.EXTRA_CONTENT_ID, "prototype_1")
                i.putExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, 10)
                i.putExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, 5)
                i.putExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, 3)
            }
        }
    }
}
