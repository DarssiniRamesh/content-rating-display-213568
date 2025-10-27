package org.example.utilities

import org.junit.Assert.assertEquals
import org.junit.Test

class SmokeTest {
    // PUBLIC_INTERFACE
    @Test
    fun ping_isOk() {
        assertEquals("utilities-ok", ModuleProbe.ping())
    }
}
