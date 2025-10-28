# Package Alignment

- AndroidManifest package: org.example.app
- Gradle applicationId: org.example.app

Use this package for adb commands, e.g.:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.example.app
