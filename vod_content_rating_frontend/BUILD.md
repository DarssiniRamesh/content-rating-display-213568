Android project build instructions

Project Gradle root:
- content-rating-display-213568/vod_content_rating_frontend

Build locally:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew build

CI/Analyzer hints:
- Set working directory to content-rating-display-213568/vod_content_rating_frontend before running any Gradle task.
- Alternatively, invoke the root-level ./gradlew wrapper that forwards to the nested project.
- If your analyzer requires a Gradle settings file at repo root, use the provided settings.gradle (delegates to nested DCL settings).
