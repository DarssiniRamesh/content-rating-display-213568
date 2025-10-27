package org.example.app

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

/**
 * PUBLIC_INTERFACE
 * Ensures TV entrypoint classes are resolvable at compile-time.
 */
class TvEntryPointsTest {

    @Test
    fun classesResolve() {
        assertNotNull(TvEntryPoints.indexActivityClass())
        assertNotNull(TvEntryPoints.instructionsActivityClass())
    }
}
