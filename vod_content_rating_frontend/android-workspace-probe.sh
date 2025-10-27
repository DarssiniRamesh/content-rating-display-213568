#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
echo "Android workspace: $ROOT"
if [ -x "$ROOT/gradlew" ]; then
  echo "Gradle wrapper detected at $ROOT/gradlew"
else
  echo "Gradle wrapper not found at $ROOT/gradlew" >&2
  exit 2
fi
echo "Suggested build: cd $ROOT && ./gradlew :app:assembleDebug"
