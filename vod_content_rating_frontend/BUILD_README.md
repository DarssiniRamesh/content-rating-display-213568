# Android Workspace Root

This is the Android workspace root for the project.

Build using the provided Gradle 9 Declarative wrapper:

- Linux/macOS:
  ./gradlew :app:assembleDebug

- Windows:
  gradlew.bat :app:assembleDebug

The authoritative Gradle configuration is in:
- settings.gradle.dcl (root)
- app/build.gradle.dcl (module)
- utilities/build.gradle.dcl
- list/build.gradle.dcl
