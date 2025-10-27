package org.example.app.tv

import android.os.Build
import android.webkit.WebSettings
import android.webkit.WebView

/**
 * PUBLIC_INTERFACE
 * TvWebViewConfigurator
 * Applies TV-friendly defaults to a WebView (user agent, scrollbars, viewport).
 */
object TvWebViewConfigurator {
    /**
     * PUBLIC_INTERFACE
     * configure
     * Sets common WebView settings for Android TV.
     */
    fun configure(wv: WebView) {
        val s: WebSettings = wv.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.useWideViewPort = true
        s.loadWithOverviewMode = true
        s.builtInZoomControls = false
        s.displayZoomControls = false
        s.mediaPlaybackRequiresUserGesture = false
        // Set a clear UA suffix to simplify troubleshooting on TV
        val baseUa = s.userAgentString ?: ""
        s.userAgentString = "$baseUa TVWebView/1.0"
        // TV-friendly scrollbars
        wv.isHorizontalScrollBarEnabled = true
        wv.isVerticalScrollBarEnabled = true
        if (Build.VERSION.SDK_INT >= 29) {
            s.forceDark = WebSettings.FORCE_DARK_OFF
        }
    }
}
