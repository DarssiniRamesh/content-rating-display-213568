# Android Workspace Root

This directory is the Android Gradle project root.

- Settings (Declarative): settings.gradle.dcl
- Wrapper: ./gradlew
- Modules: :app, :list, :utilities
- Launcher Activity: org.example.app.ui.IndiceActivity

Build:
  ./gradlew :app:assembleDebug

Deep Link:
  app://rating/show
