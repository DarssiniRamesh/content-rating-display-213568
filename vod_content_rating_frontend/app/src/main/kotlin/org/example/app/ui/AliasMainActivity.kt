package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * AliasMainActivity: Stable MAIN/LAUNCHER alias forwarding to ÍndiceActivity.
 * Some scanners require a single, explicit launcher Activity.
 */
class AliasMainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
