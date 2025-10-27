CI Notes (Android Gradle Root)

This directory is the Android Gradle root. Conventional markers present:
- settings.gradle (includes :app, :list, :utilities)
- build.gradle (root)
- gradle.properties
- gradlew, gradlew.bat

Build commands:
- ./gradlew build
- ./gradlew :app:assembleDebug

Instrumentation tests:
- ./gradlew connectedAndroidTest

If invoked from repository root, set working directory to this folder.
