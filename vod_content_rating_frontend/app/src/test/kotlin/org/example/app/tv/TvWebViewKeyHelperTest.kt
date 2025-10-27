package org.example.app.tv

import android.view.KeyEvent
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Basic tests for TvWebViewKeyHelper paging key detection path.
 *
 * Note: We only verify the return value logic for ACTION_DOWN; actual WebView scrolling
 * is exercised on device/emulator.
 */
class TvWebViewKeyHelperTest {

    private class FakeWebView {
        var height: Int = 1000
        fun scrollBy(x: Int, y: Int) { /* no-op for unit test */ }
    }

    @Test
    fun returnsFalseOnNonActionDown() {
        val result = TvWebViewKeyHelper.handleKeyForPaging(
            webView = android.webkit.WebView(null),
            keyCode = KeyEvent.KEYCODE_DPAD_DOWN,
            action = KeyEvent.ACTION_UP
        )
        assertFalse(result)
    }

    @Test
    fun returnsTrueOnDpadDownActionDown() {
        val result = TvWebViewKeyHelper.handleKeyForPaging(
            webView = android.webkit.WebView(null),
            keyCode = KeyEvent.KEYCODE_DPAD_DOWN,
            action = KeyEvent.ACTION_DOWN
        )
        assertTrue(result)
    }

    @Test
    fun returnsTrueOnDpadUpActionDown() {
        val result = TvWebViewKeyHelper.handleKeyForPaging(
            webView = android.webkit.WebView(null),
            keyCode = KeyEvent.KEYCODE_DPAD_UP,
            action = KeyEvent.ACTION_DOWN
        )
        assertTrue(result)
    }
}
