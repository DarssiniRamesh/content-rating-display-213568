The repository root gradle wrapper (./gradlew and ./gradlew.bat) is a bootstrap that delegates all Gradle commands to the actual wrapper inside:
content-rating-display-213568/vod_content_rating_frontend/gradlew

This allows CI tools that run ./gradlew from repo root to operate on the Android project transparently.
