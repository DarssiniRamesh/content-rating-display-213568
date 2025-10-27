package org.example.app.tv

import android.view.KeyEvent

/**
 * PUBLIC_INTERFACE
 * KeyEventExtensions
 * Utility extensions for DPAD/Enter detection.
 */
object KeyEventExtensions {
    // PUBLIC_INTERFACE
    fun isEnter(keyCode: Int): Boolean =
        keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER
}
