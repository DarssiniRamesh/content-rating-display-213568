package org.example.app.tv

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Sanity instrumentation test to verify TvInstructionsActivity launches and closes.
 */
@RunWith(AndroidJUnit4::class)
class TvInstructionsActivityTest {

    @Test
    fun launchesTvInstructions() {
        ActivityScenario.launch(TvInstructionsActivity::class.java).use { scenario ->
            // Close activity to ensure no crashes on finish
            scenario.close()
        }
    }
}
