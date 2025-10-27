package org.example.list

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BuildMarkerTest {
    @Test
    fun `list marker present`() {
        assertTrue(BuildMarker.present())
    }
}
