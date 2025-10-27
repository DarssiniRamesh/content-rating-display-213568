package org.example.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Simple instrumentation test to assert context package is loaded.
 */
@RunWith(AndroidJUnit4::class)
class TvSanityInstrumentedTest {

    @Test
    fun appContextLoads() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertTrue(appContext.packageName.isNotEmpty())
    }
}
