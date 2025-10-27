package org.example.app

import android.app.Activity
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * TvSplashRedirectSafe
 * Non-exported placeholder Activity referenced in the manifest for internal redirection.
 * Currently does nothing and immediately finishes.
 */
class TvSplashRedirectSafe : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }
}
