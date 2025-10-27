package org.example.app.tv

/**
 * PUBLIC_INTERFACE
 * WebViewAssetLoaderHelper
 * Utility to build asset URLs for loading HTML/CSS/JS from app/src/main/assets in a WebView.
 */
object WebViewAssetLoaderHelper {
    // PUBLIC_INTERFACE
    fun url(assetFileName: String): String = "file:///android_asset/$assetFileName"
}
