package org.example.app.ui

import android.app.Activity
import android.content.Intent
import org.example.app.data.IntentKeys

/**
 * PUBLIC_INTERFACE
 * PostPlaybackDeeplinkResolver ensures essential extras exist when launching PostPlaybackRatingActivity
 * from deep links or entry points that may omit them. It injects safe defaults without mutating
 * caller state beyond the local intent instance.
 */
object PostPlaybackDeeplinkResolver {

    // PUBLIC_INTERFACE
    fun resolveDefaultsIfMissing(activity: Activity) {
        val i: Intent = activity.intent ?: return
        if (!i.hasExtra(IntentKeys.EXTRA_CONTENT_ID)) {
            i.putExtra(IntentKeys.EXTRA_CONTENT_ID, "prototype_1")
        }
        if (!i.hasExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC)) {
            i.putExtra(IntentKeys.EXTRA_DISPLAY_TIME_SEC, 10)
        }
        if (!i.hasExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC)) {
            i.putExtra(IntentKeys.EXTRA_PLAYBACK_POSITION_SEC, 3)
        }
        if (!i.hasExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC)) {
            i.putExtra(IntentKeys.EXTRA_ROLLING_CREDITS_SEC, 3)
        }
    }
}
