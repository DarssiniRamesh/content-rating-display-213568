ProGuard/R8 notes

- proguard-rules.pro keeps TV activities (org.example.app.tv.**) and WebView to avoid reflection-related issues.
- app/build.gradle references the ProGuard file for the release buildType:
  proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
- Debug manifest overlay (src/debug/AndroidManifest.xml) adds a normal LAUNCHER intent to TvIndexActivity to help tools that do not honor LEANBACK_LAUNCHER.
