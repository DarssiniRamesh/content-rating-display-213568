package org.example.app.tv

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * A minimal instrumentation test to verify the Android context/package under test.
 */
@RunWith(AndroidJUnit4::class)
class TvSanityInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.gradle.experimental.android.app", appContext.packageName)
    }
}
