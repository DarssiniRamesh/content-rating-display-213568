package org.example.app.tv

import android.content.Context
import android.content.pm.PackageManager

/**
 * PUBLIC_INTERFACE
 * TvDeviceChecks
 * Utility methods to check whether the current device supports Leanback (Android TV).
 */
object TvDeviceChecks {
    // PUBLIC_INTERFACE
    fun isTv(context: Context): Boolean {
        val pm: PackageManager = context.packageManager
        return pm.hasSystemFeature("android.software.leanback")
    }
}
