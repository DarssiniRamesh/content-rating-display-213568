#!/bin/sh
set -e
ANDROID_ROOT="content-rating-display-213568/vod_content_rating_frontend"
echo "Running Android instrumentation tests in: $ANDROID_ROOT"
cd "$ANDROID_ROOT"
./gradlew connectedAndroidTest
