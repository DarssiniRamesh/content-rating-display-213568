/**
 * PUBLIC_INTERFACE
 * TV Activities overview:
 *
 * - TvIndexActivity (LEANBACK_LAUNCHER):
 *   Purpose: Entry for TV. Shows title + primary "Continuar" button and a WebView rendering Índice (41:135).
 *   Inputs: DPAD navigation (↑ ↓ ← →), DPAD_CENTER/Enter, Back.
 *   Output: Navigates to TvInstructionsActivity on select; Back finishes.
 *
 * - TvInstructionsActivity:
 *   Purpose: Shows Instrucciones (41:206) in a WebView with "Entendido" acknowledge button.
 *   Inputs: DPAD navigation and paging in WebView; DPAD_CENTER/Enter; Back.
 *   Output: On "Entendido", returns to TvIndexActivity (placeholder for next flow).
 *
 * Helpers:
 * - TvWebViewKeyHelper: Adds pageUp/pageDown handling for WebView on TV.
 * - TvBackHandler: Consistent Back key handling for TV screens.
 * - WebViewAssetLoaderHelper: Centralizes asset URL building (file:///android_asset/…).
 */
package org.example.app.tv

object TvDocs
