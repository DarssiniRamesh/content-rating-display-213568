package org.example.app.tv

import android.view.KeyEvent
import android.webkit.WebView
import kotlin.math.max
import kotlin.math.min

/**
 * PUBLIC_INTERFACE
 * TvWebViewKeyHelper
 * Utility to handle DPAD paging behavior for WebViews on TV with remote inputs.
 */
object TvWebViewKeyHelper {

    // PUBLIC_INTERFACE
    fun handleKeyForPaging(webView: WebView, keyCode: Int, action: Int): Boolean {
        if (action != KeyEvent.ACTION_DOWN) return false
        val height = webView.height
        val step = max(1, (height * 0.8f).toInt()) // 80% of viewport as a page step
        return when (keyCode) {
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                webView.scrollBy(0, step)
                true
            }
            KeyEvent.KEYCODE_DPAD_UP -> {
                webView.scrollBy(0, -step)
                true
            }
            else -> false
        }
    }
}
