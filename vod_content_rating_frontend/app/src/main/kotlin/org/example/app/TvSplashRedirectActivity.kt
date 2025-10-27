package org.example.app

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Build
import android.view.WindowManager
import org.example.app.tv.TvIndexActivity

/**
 * PUBLIC_INTERFACE
 * TvSplashRedirectActivity
 * Simple splash/redirect Activity that decides whether to open the TV Index or MainActivity.
 * It is the MAIN/LAUNCHER entry for the app on all devices.
 */
class TvSplashRedirectActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Keep splash window hardware accelerated and fast
        window.addFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED)

        val isTv = packageManager.hasSystemFeature(PackageManager.FEATURE_LEANBACK)
        val intent = if (isTv) {
            Intent(this, TvIndexActivity::class.java)
        } else {
            Intent(this, MainActivity::class.java)
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
