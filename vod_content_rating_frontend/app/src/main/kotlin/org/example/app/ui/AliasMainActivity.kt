package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * AliasMainActivity
 *
 * A tiny alias launcher activity that immediately forwards to ÍndiceActivity.
 * This helps tools that expect a traditional "MainActivity" style entry.
 */
class AliasMainActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
