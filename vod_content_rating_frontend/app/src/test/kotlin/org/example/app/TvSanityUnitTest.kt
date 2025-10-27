package org.example.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Verifies that MessageUtils.message() returns the expected string.
 * This ensures the app module unit test setup runs.
 */
class TvSanityUnitTest {

    @Test
    fun messageUtilsReturnsExpected() {
        assertEquals("Hello     World!", MessageUtils.message())
    }
}
