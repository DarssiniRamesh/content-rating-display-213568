# Deep Links (Android Workspace)

Primary rating preview deep link:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Routes
- app://rating/show -> org.example.app.ui.DeepLinkLauncherActivity -> PostPlaybackRatingActivity

QA flows (no adb required)
- Launcher -> Índice -> "Start Playback" (starts rating preview directly)
- Launcher -> Índice -> "Open Rating (Deep Link)" (invokes the deep link path internally)
- Launcher -> Índice -> "Instructions" -> Proceed (navigates to rating preview with a different sample)

Notes
- Executive Gray theme is applied app-wide (@style/Theme.ExecutiveGray and AppCompat alias).
- Acknowledge is countdown-gated when requireCountdown=true; otherwise enabled immediately.
