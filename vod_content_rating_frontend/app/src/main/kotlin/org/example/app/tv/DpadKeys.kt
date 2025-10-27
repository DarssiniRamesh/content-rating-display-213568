package org.example.app.tv

import android.view.KeyEvent

/**
 * PUBLIC_INTERFACE
 * DpadKeys
 * Helpers to check for DPAD/Enter actions in a consistent manner.
 */
object DpadKeys {
    // PUBLIC_INTERFACE
    fun isSelect(keyCode: Int): Boolean =
        keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER

    // PUBLIC_INTERFACE
    fun isDirectional(keyCode: Int): Boolean =
        keyCode == KeyEvent.KEYCODE_DPAD_UP || keyCode == KeyEvent.KEYCODE_DPAD_DOWN ||
                keyCode == KeyEvent.KEYCODE_DPAD_LEFT || keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
}
