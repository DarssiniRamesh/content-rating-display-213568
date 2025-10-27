#!/bin/sh
# Helper: delegate Gradle command to nested Android project
set -e
ANDROID_ROOT="content-rating-display-213568/vod_content_rating_frontend"
CMD="${1:-build}"
echo "Delegating to nested Gradle at $ANDROID_ROOT with task: $CMD"
cd "$ANDROID_ROOT"
exec ./gradlew "$CMD"
