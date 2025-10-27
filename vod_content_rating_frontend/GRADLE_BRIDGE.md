This repository includes Gradle compatibility bridges:

- Root settings.gradle and build.gradle to help analyzers detect a Gradle project at repository root.
- A root gradle wrapper launcher that delegates to the Android project under content-rating-display-213568/vod_content_rating_frontend.
- A root gradle/wrapper/gradle-wrapper.properties to satisfy tools that require it at the repository root.

Build options:
- From repo root: ./gradlew :content-rating-display-213568:vod_content_rating_frontend:app:assembleDebug
- Or cd content-rating-display-213568/vod_content_rating_frontend and run: ./gradlew :app:assembleDebug
