package org.example.app.tv

/**
 * PUBLIC_INTERFACE
 * Tv navigation summary:
 * - TvIndexActivity -> navigates to TvInstructionsActivity via primary DPAD/Enter.
 * - TvInstructionsActivity -> returns to TvIndexActivity via Acknowledge (stub for next step).
 * Focus handling:
 * - Buttons use focus ring drawables.
 * - WebViews accept DPAD paging via TvWebViewKeyHelper.
 */
object TvNavigationDoc
