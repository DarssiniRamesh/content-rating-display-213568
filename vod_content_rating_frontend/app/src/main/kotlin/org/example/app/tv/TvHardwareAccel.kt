package org.example.app.tv

import android.os.Build
import android.view.View
import android.webkit.WebView

/**
 * PUBLIC_INTERFACE
 * TvHardwareAccel
 * Helper to enable hardware acceleration layers on views where beneficial.
 */
object TvHardwareAccel {

    // PUBLIC_INTERFACE
    fun enableOn(webView: WebView) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webView.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        }
    }
}
