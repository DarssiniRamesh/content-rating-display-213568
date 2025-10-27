package org.example.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.example.app.tv.TvIndexActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * PUBLIC_INTERFACE
 * Basic instrumentation sanity test that launches the TV index activity.
 */
@RunWith(AndroidJUnit4::class)
class TvActivitiesLaunchTest {

    @Rule @JvmField
    val activityRule = ActivityTestRule(TvIndexActivity::class.java, false, false)

    @Test
    fun launchTvIndex() {
        // Launch activity to verify it starts without crashing
        activityRule.launchActivity(null)
    }
}
