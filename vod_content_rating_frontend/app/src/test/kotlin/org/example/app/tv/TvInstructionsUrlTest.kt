package org.example.app.tv

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Ensures the instructions wrapper path uses our TV wrapper HTML naming.
 */
class TvInstructionsUrlTest {
    @Test
    fun wrapperFileNameLooksCorrect() {
        val url = WebViewAssetLoaderHelper.url("instrucciones-41-206.wrapper.html")
        assertTrue(url.contains("instrucciones-41-206.wrapper.html"))
    }
}
