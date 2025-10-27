This Android project uses Gradle 9 with Declarative Gradle (.dcl) for settings and module builds:

- settings.gradle.dcl declares modules: app, list, utilities
- app/ uses traditional build.gradle (Groovy) for the application module
- list/ and utilities/ use build.gradle.dcl (Declarative) for library modules

Gradle root for this Android project:
content-rating-display-213568/vod_content_rating_frontend

Build commands:
  ./gradlew :app:assembleDebug
  ./gradlew test
