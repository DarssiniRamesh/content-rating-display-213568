package org.example.list

import org.junit.Assert.assertEquals
import org.junit.Test

class SmokeTest {
    // PUBLIC_INTERFACE
    @Test
    fun ping_isOk() {
        assertEquals("list-ok", ModuleProbe.ping())
    }
}
