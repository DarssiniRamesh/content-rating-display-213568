Android Project Build Guide

Project root (nested):
- content-rating-display-213568/vod_content_rating_frontend

How to build:
- ./gradlew :app:assembleDebug

Print modules:
- ./gradlew -I gradle-print-modules.gradle printModules

Modules:
- :app
- :list
- :utilities

Java/Kotlin:
- JDK 17, Kotlin 2.0.21

Notes:
- This project uses Gradle 9 Declarative settings (settings.gradle.dcl). A Groovy/Kotlin proxy settings file also exists for tooling compatibility.
- TV Activities: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER), org.example.app.tv.TvInstructionsActivity
