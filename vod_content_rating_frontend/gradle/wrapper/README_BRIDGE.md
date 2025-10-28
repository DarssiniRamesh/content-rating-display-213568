This is a root-level Gradle wrapper bridge for analyzers/CI tools that start at repository root.

The actual Android project lives under:
- content-rating-display-213568/vod_content_rating_frontend

Usage:
- ./gradlew :app:assembleDebug
or
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

The wrapper JAR will be downloaded automatically on first use.
