Root Gradle Wrapper

This repository provides a root-level wrapper shim that delegates to the nested Android Gradle project:
- Project root: content-rating-display-213568/vod_content_rating_frontend
- Wrapper: ./gradlew (delegates to nested wrapper)

If your CI requires a root-level Gradle wrapper metadata directory, the gradle/wrapper/gradle-wrapper.properties is provided.
