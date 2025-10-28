# Root Alias App Module (Bridge)

Some static analyzers expect an `app/` module at repository root.
This is an alias pointing to the real app module located at:
- content-rating-display-213568/vod_content_rating_frontend/app

Build the real app:
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
