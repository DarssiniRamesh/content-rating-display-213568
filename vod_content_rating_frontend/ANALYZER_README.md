Analyzer Instructions

This repository contains a nested Android Gradle project.

To discover its root via Gradle, run (from repo root):
./gradlew -I gradle-tasks-help.gradle printAndroidProjectRoot

Then cd to the printed path and run:
./gradlew :app:assembleDebug
