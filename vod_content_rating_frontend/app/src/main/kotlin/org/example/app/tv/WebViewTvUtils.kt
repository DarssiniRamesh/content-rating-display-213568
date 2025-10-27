package org.example.app.tv

import android.os.Build
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView

/**
 * PUBLIC_INTERFACE
 * WebViewTvUtils centralizes safe WebView settings suitable for Android TV.
 * It enables JavaScript, DOM storage, overview mode, disables zoom UI,
 * and sets focus properties to work well with DPAD navigation.
 */
object WebViewTvUtils {

    // PUBLIC_INTERFACE
    fun configure(webView: WebView) {
        val s: WebSettings = webView.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.loadWithOverviewMode = true
        s.useWideViewPort = true
        s.displayZoomControls = false
        s.builtInZoomControls = false
        s.cacheMode = WebSettings.LOAD_DEFAULT
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            s.safeBrowsingEnabled = true
        }
        webView.isFocusable = true
        webView.isFocusableInTouchMode = true
        webView.descendantFocusability = View.FOCUS_BEFORE_DESCENDANTS
        webView.overScrollMode = View.OVER_SCROLL_NEVER
    }
}
