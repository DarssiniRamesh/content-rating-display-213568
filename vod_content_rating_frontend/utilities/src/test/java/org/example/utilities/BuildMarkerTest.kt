package org.example.utilities

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BuildMarkerTest {
    @Test
    fun `utilities marker present`() {
        assertTrue(BuildMarker.present())
    }
}
