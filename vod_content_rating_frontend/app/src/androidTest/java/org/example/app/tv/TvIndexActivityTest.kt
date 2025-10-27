package org.example.app.tv

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.core.app.ActivityScenario
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Sanity instrumentation test to verify TvIndexActivity launches.
 */
@RunWith(AndroidJUnit4::class)
class TvIndexActivityTest {

    @Test
    fun launchesTvIndex() {
        ActivityScenario.launch(TvIndexActivity::class.java).use {
            // If we reach here, activity started successfully.
        }
    }
}
