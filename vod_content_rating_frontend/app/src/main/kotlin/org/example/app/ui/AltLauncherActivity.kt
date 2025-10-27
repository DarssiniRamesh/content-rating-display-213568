/**
 * PUBLIC_INTERFACE
 * AltLauncherActivity provides a minimal launcher entry for analyzers:
 * It immediately forwards to IndiceActivity.
 */
package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class AltLauncherActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
