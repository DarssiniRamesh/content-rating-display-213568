# Android TV Usage Guide

Gradle root: this directory (content-rating-display-213568/vod_content_rating_frontend)

Build:
- ./gradlew assembleDebug

Run (emulator or device):
- Install: ./gradlew :app:installDebug
- Launch TV (Leanback) entry: open the TV Home and select the app banner (LEANBACK_LAUNCHER).
- On phones/tablets, launch :app and use overflow menu "Open TV Index (debug)".

Screens:
- TV Index (Índice 41:135): DPAD to "Continuar" or press OK to navigate to Instrucciones.
- TV Instrucciones (41:206): Review content, press "Entendido" to continue (stub returns to Index).

Focus & DPAD:
- Buttons are focusable with a visible ring.
- WebViews accept DPAD and scroll on up/down.
- Overscan-safe margins are in layout-tv/ resources.

Assets:
- HTML/CSS/JS copied under app/src/main/assets to load via file:///android_asset/.

Notes:
- If running strict network policies, AndroidManifest uses networkSecurityConfig to permit local assets.
- For analyzers that cannot autodetect root, run scripts from this directory or use ../../build-android.sh at repo root.
