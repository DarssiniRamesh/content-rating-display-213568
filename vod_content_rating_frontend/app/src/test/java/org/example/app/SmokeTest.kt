package org.example.app

import org.junit.Assert.assertEquals
import org.junit.Test

class SmokeTest {
    // PUBLIC_INTERFACE
    @Test
    fun hello_isOk() {
        assertEquals("ok", BuildProbe.hello())
    }
}
