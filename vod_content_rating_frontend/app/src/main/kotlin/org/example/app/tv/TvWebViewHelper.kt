package org.example.app.tv

import android.graphics.Bitmap
import android.net.Uri
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * PUBLIC_INTERFACE
 * TvWebViewHelper provides a WebViewClient tailored for TV:
 * - Keeps navigation within local assets.
 * - Preserves DPAD focus by focusing the WebView after page load.
 * - Prevents external http(s) navigation; can be extended to open external apps.
 */
object TvWebViewHelper {

    // PUBLIC_INTERFACE
    fun attachDefaultClient(webView: WebView) {
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                val url = request?.url ?: return false
                return handleUrl(view, url)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                return if (url != null) handleUrl(view, Uri.parse(url)) else false
            }

            private fun handleUrl(view: WebView?, uri: Uri): Boolean {
                // Only allow local asset urls
                return when (uri.scheme) {
                    "file" -> false // allow
                    "about" -> false
                    else -> {
                        // Block external navigation by default on TV
                        true
                    }
                }
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // Ensure DPAD selection returns to the WebView if user navigates into it
                view?.apply {
                    isFocusable = true
                    isFocusableInTouchMode = true
                    requestFocus(View.FOCUS_DOWN)
                }
            }
        }
    }
}
