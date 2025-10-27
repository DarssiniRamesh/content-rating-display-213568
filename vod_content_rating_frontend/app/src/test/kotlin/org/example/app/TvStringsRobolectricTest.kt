package org.example.app

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.robolectric.RobolectricTestRunner
import org.junit.runner.RunWith
import android.content.Context
import androidx.test.core.app.ApplicationProvider

/**
 * PUBLIC_INTERFACE
 * Basic Robolectric test to validate resource availability.
 */
@RunWith(RobolectricTestRunner::class)
class TvStringsRobolectricTest {

    @Test
    fun appName_isAvailable() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val name = context.getString(R.string.app_name)
        assertNotNull(name)
    }
}
