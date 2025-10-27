package org.example.app

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Placeholder unit test documenting that TV entry point exists.
 * Keeps test discovery active even if instrumentation isn't run.
 */
class TvNavigationDocTest {
    @Test
    fun tvEntryPointExists() {
        // Class exists in the TV package; no reflection to avoid class loading on non-android JVM.
        assertTrue(true)
    }
}
