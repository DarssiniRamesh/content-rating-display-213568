package org.example.app.tv

import android.app.Activity
import android.view.KeyEvent

/**
 * PUBLIC_INTERFACE
 * TvBackHandler
 * Handles DPAD Back key consistently across TV screens.
 */
object TvBackHandler {
    /**
     * PUBLIC_INTERFACE
     * handleBackKey
     * Returns true if the back key was handled (finishes the activity).
     */
    fun handleBackKey(activity: Activity, keyCode: Int, action: Int): Boolean {
        if (action != KeyEvent.ACTION_DOWN) return false
        return if (keyCode == KeyEvent.KEYCODE_BACK) {
            activity.finish()
            true
        } else {
            false
        }
    }
}
