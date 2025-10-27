#!/usr/bin/env bash
set -euo pipefail

# Canonical Android project root
ANDROID_ROOT="content-rating-display-213568/vod_content_rating_frontend"

if [ ! -f "$ANDROID_ROOT/gradlew" ]; then
  echo "Gradle wrapper not found at $ANDROID_ROOT/gradlew"
  exit 1
fi

cd "$ANDROID_ROOT"
exec ./gradlew :app:assembleDebug
