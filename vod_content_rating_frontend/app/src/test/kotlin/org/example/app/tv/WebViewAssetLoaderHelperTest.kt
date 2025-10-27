package org.example.app.tv

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Verifies that the WebViewAssetLoaderHelper generates correct file URLs.
 */
class WebViewAssetLoaderHelperTest {

    @Test
    fun url_buildsFileAndroidAssetPath() {
        assertEquals("file:///android_asset/foo.html", WebViewAssetLoaderHelper.url("foo.html"))
        assertEquals("file:///android_asset/dir/page.html", WebViewAssetLoaderHelper.url("dir/page.html"))
    }
}
