#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
if [ ! -x "$ROOT/gradlew" ]; then
  echo "Gradle wrapper not found at $ROOT/gradlew" >&2
  exit 1
fi
cd "$ROOT"
exec ./gradlew :app:assembleDebug
