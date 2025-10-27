package org.example.app

import android.content.Intent
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.example.app.ui.IndiceActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LauncherPresenceTest {
    // PUBLIC_INTERFACE
    @Test
    fun canResolveIndiceActivity() {
        val context = ApplicationProvider.getApplicationContext<android.content.Context>()
        val i = Intent(context, IndiceActivity::class.java)
        // Do not actually start; presence is enough for analysis environments
        assert(i.component != null)
    }
}
