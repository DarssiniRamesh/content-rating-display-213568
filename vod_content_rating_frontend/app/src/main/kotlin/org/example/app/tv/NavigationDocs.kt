package org.example.app.tv

/**
 * PUBLIC_INTERFACE
 * Navigation overview for TV:
 *
 * - Launch: TvIndexActivity (LEANBACK_LAUNCHER)
 * - Primary action: "Continuar" -> starts TvInstructionsActivity
 * - TvInstructionsActivity: "Entendido" -> returns to TvIndexActivity (stub for next flow)
 *
 * DPAD Behavior:
 * - Default focus on primary buttons after layout inflation.
 * - WebView focus loops back to button via nextFocus* attributes.
 * - Page up/down support in instructions WebView for long content.
 *
 * Asset Loading:
 * - WebViews load from file:///android_asset/ (ndice-41-135.html, instrucciones-41-206.html).
 * - TvWebViewHelper restricts navigation to local assets for TV safety.
 */
object NavigationDocs
