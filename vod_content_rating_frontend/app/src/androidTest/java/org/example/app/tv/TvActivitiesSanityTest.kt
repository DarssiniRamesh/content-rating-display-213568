package org.example.app.tv

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Basic instrumentation sanity test that launches the TV Index activity.
 * Ensures the Activity can be instantiated in an instrumented environment.
 */
@RunWith(AndroidJUnit4::class)
class TvActivitiesSanityTest {

    @Rule @JvmField
    val rule = ActivityTestRule(TvIndexActivity::class.java, true, false)

    @Test
    fun launchIndexActivity() {
        rule.launchActivity(null)
        // No assertions; will fail if Activity cannot start.
    }
}
