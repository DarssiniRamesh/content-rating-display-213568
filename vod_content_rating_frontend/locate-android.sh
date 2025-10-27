#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
echo "ANDROID_ROOT=$ROOT"
if [ -x "$ROOT/gradlew" ]; then
  echo "WRAPPER=$ROOT/gradlew"
else
  echo "ERROR: Gradle wrapper not found at $ROOT/gradlew" >&2
  exit 2
fi
echo "BUILD_CMD=cd $ROOT && ./gradlew :app:assembleDebug"
