package org.example.app.tv

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Basic sanity instrumentation test that launches the TvIndexActivity.
 */
@RunWith(AndroidJUnit4::class)
class TvIndexActivityLaunchTest {

    @Test
    fun launchTvIndex() {
        ActivityScenario.launch(TvIndexActivity::class.java).use {
            // If we reached here without crash, consider pass
        }
    }
}
