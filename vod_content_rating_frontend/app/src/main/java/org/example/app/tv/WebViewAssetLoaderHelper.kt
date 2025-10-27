package org.example.app.tv

/**
 * PUBLIC_INTERFACE
 * WebViewAssetLoaderHelper
 * Centralizes the base URLs for loading local assets into WebViews.
 */
object WebViewAssetLoaderHelper {
    /** PUBLIC_INTERFACE */
    const val ANDROID_ASSET_BASE = "file:///android_asset/"
    /** PUBLIC_INTERFACE */
    fun url(path: String): String = if (path.startsWith("file://")) path else ANDROID_ASSET_BASE + path.trimStart('/')
}
