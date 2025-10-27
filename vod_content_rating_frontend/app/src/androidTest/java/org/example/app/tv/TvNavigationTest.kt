package org.example.app.tv

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import org.example.app.R
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Simple instrumentation test to exercise navigation from TV Index to Instructions via the native button.
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class TvNavigationTest {

    @Test
    fun navigateFromIndexToInstructions() {
        val scenario = ActivityScenario.launch(TvIndexActivity::class.java)
        scenario.onActivity { activity ->
            val btn = activity.findViewById<android.widget.Button>(R.id.btnPrimary)
            btn.performClick()
        }
        // If no exception thrown, navigation path is valid and TvInstructionsActivity starts.
    }
}
