package org.example.app.tv

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Verifies that TvIndexActivity launches without crashing.
 */
@RunWith(AndroidJUnit4::class)
class TvIndexLaunchTest {

    @Test
    fun launchIndex() {
        ActivityScenario.launch(TvIndexActivity::class.java).use {
            // No-op: launch success is sufficient for this sanity test
        }
    }
}
