# Android/Kotlin Project Root Bridge

This repository contains an Android project under:
- content-rating-display-213568/vod_content_rating_frontend

Build entry:
- Wrapper: content-rating-display-213568/vod_content_rating_frontend/gradlew
- Command: ./gradlew :app:assembleDebug

Primary Gradle configuration (Declarative Gradle):
- content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl
- content-rating-display-213568/vod_content_rating_frontend/app/build.gradle.dcl
- content-rating-display-213568/vod_content_rating_frontend/utilities/build.gradle.dcl
- content-rating-display-213568/vod_content_rating_frontend/list/build.gradle.dcl

If a tool requires traditional Gradle at repository root:
- settings.gradle includes the Android workspace via includeBuild("content-rating-display-213568/vod_content_rating_frontend")
- build.gradle delegates assemble and clean to the workspace wrapper.
