# Android Project Root (Gradle Declarative)

This directory is the Android Gradle project root.

Gradle (Declarative) files:
- settings.gradle.dcl (primary)
- app/build.gradle.dcl
- list/build.gradle.dcl
- utilities/build.gradle.dcl

Compatibility pointers for discovery tools:
- settings.gradle (thin pointer)
- settings.gradle.kts (thin pointer)
- build.gradle (thin pointer)
- local.properties (marker)
- GRADLE_PROJECT_ROOT.md (marker)
- PROJECT_LOCATOR.txt (marker)

Wrapper:
- ./gradlew (Unix)
- ./gradlew.bat (Windows)

Build:
- ./gradlew :app:assembleDebug

Launcher Activity:
- org.example.app.ui.IndiceActivity (declared in app/src/main/AndroidManifest.xml)
