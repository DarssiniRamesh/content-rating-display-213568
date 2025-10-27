# How to Build

This directory is the Gradle root for the Android project.

- App module: :app
- Utility modules: :utilities, :list

Build (from this directory):
```bash
./gradlew :app:assembleDebug
```

Run unit tests:
```bash
./gradlew :app:testDebugUnitTest
```

Run instrumentation tests (requires device/emulator):
```bash
./gradlew :app:connectedDebugAndroidTest
```

Android TV launchable Activities:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.tv.TvInstructionsActivity
