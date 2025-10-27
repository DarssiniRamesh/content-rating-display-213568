package org.example.app.tv.web

/**
 * PUBLIC_INTERFACE
 * WebViewAssetLoaderHelper
 * Utility to build a URL pointing to bundled assets for use in WebView.
 * Currently returns a file:///android_asset/ URL for the given asset path.
 */
object WebViewAssetLoaderHelper {
    /** Returns a URL for the given asset path, e.g., "page.html" -> "file:///android_asset/page.html" */
    fun url(assetPath: String): String = "file:///android_asset/$assetPath"
}
