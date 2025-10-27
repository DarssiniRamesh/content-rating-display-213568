# Android Gradle Project (Nested)

This is the Android Gradle project root.

Modules:
- :app
- :list
- :utilities

Build:
- ./gradlew :app:assembleDebug

Print modules (helper init script included):
- ./gradlew -I gradle-print-modules.gradle printModules
