package org.example.app.tv

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * TvSplashActivity
 * Minimal splash that immediately forwards to TvIndexActivity. Useful for TV launchers and QA flows.
 */
class TvSplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, TvIndexActivity::class.java))
        finish()
    }
}
