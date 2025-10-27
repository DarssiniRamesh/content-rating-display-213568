#!/bin/sh
# Simple helper to print Android Gradle root from nested project
cd content-rating-display-213568/vod_content_rating_frontend || exit 1
./gradlew -q printAndroidGradleRoot
