package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * DevMainLauncherActivity
 *
 * A minimal MAIN/LAUNCHER that sets the Executive Gray theme and immediately forwards to ÍndiceActivity.
 * This helps strict analyzers that expect a single, concrete launcher Activity entry point.
 */
class DevMainLauncherActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
