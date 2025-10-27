Android project build instructions

This directory is the Gradle root for the Android project.

Build:
- ./gradlew build

Assemble app:
- ./gradlew :app:assembleDebug

Run unit tests:
- ./gradlew test

Notes:
- Android TV entry Activity: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- If running tools from repository root, set working directory to this folder first.
