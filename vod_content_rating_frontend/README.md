# Android Gradle Project Root (TV-first)

This directory is the Gradle project root for the Android TV-first app.

Modules:
- :app (Android application)
- :list (Android library)
- :utilities (Android library)

Build:
- ./gradlew :app:assembleDebug
- ./gradlew :app:installDebug

TV Entry Points:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.TvSplashRedirectActivity (MAIN/LAUNCHER that redirects to TV Index on TV devices)

Assets are under app/src/main/assets/ and are loaded via file:///android_asset/.
