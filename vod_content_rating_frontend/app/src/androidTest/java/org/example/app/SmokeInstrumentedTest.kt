package org.example.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Minimal instrumentation test to verify androidTest setup.
 */
@RunWith(AndroidJUnit4::class)
class SmokeInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.gradle.experimental.android.app", appContext.packageName)
    }
}
