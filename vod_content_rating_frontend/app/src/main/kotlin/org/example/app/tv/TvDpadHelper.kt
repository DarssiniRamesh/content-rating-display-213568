package org.example.app.tv

import android.view.KeyEvent
import android.view.View

/**
 * PUBLIC_INTERFACE
 * TvDpadHelper centralizes common DPAD handling patterns for TV screens.
 */
object TvDpadHelper {

    // PUBLIC_INTERFACE
    fun handleVerticalScroll(view: View, keyCode: Int, action: Int, onUp: () -> Unit, onDown: () -> Unit): Boolean {
        if (action != KeyEvent.ACTION_DOWN) return false
        return when (keyCode) {
            KeyEvent.KEYCODE_DPAD_UP -> { onUp(); true }
            KeyEvent.KEYCODE_DPAD_DOWN -> { onDown(); true }
            else -> false
        }
    }

    // PUBLIC_INTERFACE
    fun isSelect(keyCode: Int): Boolean {
        return keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER
    }
}
