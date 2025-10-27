package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * QALauncherActivity exists to provide an additional launcher entry that routes to ÍndiceActivity,
 * helping discovery tools and QA to reach the main flow quickly.
 */
class QALauncherActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
