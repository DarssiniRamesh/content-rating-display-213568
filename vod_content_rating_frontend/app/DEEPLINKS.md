# Deep Links

You can launch the Post-Playback Rating screen directly with:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/postplay" org.gradle.experimental.android.app

Notes:
- The Activity uses stub data and default extras; for precise control, use DevLaunchRatingActivity via Índice QA button.
