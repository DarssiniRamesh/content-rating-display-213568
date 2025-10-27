package org.example.app.tv

import android.graphics.Color
import android.webkit.WebSettings
import android.webkit.WebView

/**
 * PUBLIC_INTERFACE
 * TvWebViewConfigurator
 * Centralized configuration for TV WebViews to ensure consistent 10-foot experience.
 */
object TvWebViewConfigurator {

    // PUBLIC_INTERFACE
    fun configure(webView: WebView) {
        val s: WebSettings = webView.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.cacheMode = WebSettings.LOAD_DEFAULT
        s.mediaPlaybackRequiresUserGesture = false
        s.builtInZoomControls = false
        s.displayZoomControls = false
        s.useWideViewPort = true
        s.loadWithOverviewMode = true

        webView.isFocusable = true
        webView.isFocusableInTouchMode = true
        webView.setBackgroundColor(Color.TRANSPARENT)
    }
}
