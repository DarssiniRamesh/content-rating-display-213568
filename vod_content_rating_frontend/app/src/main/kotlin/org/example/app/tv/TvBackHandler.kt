package org.example.app.tv

import android.app.Activity
import android.view.KeyEvent

/**
 * PUBLIC_INTERFACE
 * TvBackHandler
 * Consistent back navigation for TV: intercepts DPAD_BACK and BACK key presses.
 */
object TvBackHandler {

    // PUBLIC_INTERFACE
    fun handleBackKey(activity: Activity, keyCode: Int, action: Int): Boolean {
        if (action != KeyEvent.ACTION_DOWN) return false
        return when (keyCode) {
            KeyEvent.KEYCODE_BACK, KeyEvent.KEYCODE_ESCAPE -> {
                activity.finish()
                true
            }
            else -> false
        }
    }
}
