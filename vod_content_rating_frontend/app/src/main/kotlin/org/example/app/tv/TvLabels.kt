package org.example.app.tv

import android.content.Context
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * TvLabels
 * Provides TV navigation labels from resources to centralize wording.
 */
object TvLabels {
    fun continueLabel(context: Context): String = context.getString(R.string.tv_nav_continue)
    fun acknowledgeLabel(context: Context): String = context.getString(R.string.tv_nav_acknowledge)
}
