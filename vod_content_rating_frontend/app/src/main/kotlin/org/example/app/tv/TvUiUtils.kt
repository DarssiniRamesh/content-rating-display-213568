package org.example.app.tv

import android.view.View

/**
 * PUBLIC_INTERFACE
 * Requests focus safely on a View, posting the request until the view is laid out.
 * Returns true if focus was requested synchronously, false if posted for later.
 */
object TvUiUtils {
    fun requestFocusSafely(view: View?): Boolean {
        if (view == null) return false
        return if (view.isLaidOut) {
            view.requestFocus()
        } else {
            view.post { view.requestFocus() }
            false
        }
    }
}
