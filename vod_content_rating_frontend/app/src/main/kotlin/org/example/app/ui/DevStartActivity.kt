package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * DevStartActivity
 *
 * Forwards to AliasMainActivity; kept for analyzer references only.
 */
class DevStartActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, AliasMainActivity::class.java))
        finish()
    }
}
