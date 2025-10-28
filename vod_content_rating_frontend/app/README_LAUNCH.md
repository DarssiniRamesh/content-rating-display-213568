# App Launch and Deep Link

Launcher:
- org.example.app.ui.IndiceActivity

Deep link to rating preview:
- app://rating/show

Example:
- adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Flow:
- Índice → Instrucciones → PostPlaybackRatingActivity → Playback (placeholder)
