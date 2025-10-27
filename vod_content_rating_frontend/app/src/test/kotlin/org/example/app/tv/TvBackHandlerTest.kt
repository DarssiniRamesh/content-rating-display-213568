package org.example.app.tv

import android.app.Activity
import android.view.KeyEvent
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Unit test for TvBackHandler key handling logic.
 */
class TvBackHandlerTest {

    private class DummyActivity : Activity()

    @Test
    fun backKeyConsumedOnActionDown() {
        val consumed = TvBackHandler.handleBackKey(DummyActivity(), KeyEvent.KEYCODE_BACK, KeyEvent.ACTION_DOWN)
        assertTrue(consumed)
    }

    @Test
    fun nonBackKeyNotConsumed() {
        val consumed = TvBackHandler.handleBackKey(DummyActivity(), KeyEvent.KEYCODE_DPAD_DOWN, KeyEvent.ACTION_DOWN)
        assertFalse(consumed)
    }

    @Test
    fun actionUpNotConsumed() {
        val consumed = TvBackHandler.handleBackKey(DummyActivity(), KeyEvent.KEYCODE_BACK, KeyEvent.ACTION_UP)
        assertFalse(consumed)
    }
}
