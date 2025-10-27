# Android Instrumentation Tests (androidTest)

This directory contains instrumentation tests for the Android TV app.

How to run (from Android Gradle root):
  ./gradlew :app:connectedDebugAndroidTest

Tests included:
- TvSanityInstrumentedTest: verifies package context.
- TvIndexLaunchTest: launches TvIndexActivity to ensure it starts without crashing.

Requirements:
- An emulator or device must be connected and visible via `adb devices`.
