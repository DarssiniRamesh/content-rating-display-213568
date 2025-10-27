#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
ANDROID_ROOT="$ROOT/content-rating-display-213568/vod_content_rating_frontend"
if [ ! -x "$ANDROID_ROOT/gradlew" ]; then
  echo "Android gradle wrapper not found at $ANDROID_ROOT/gradlew" >&2
  exit 1
fi
echo "Detected Android project at: $ANDROID_ROOT"
cd "$ANDROID_ROOT"
./gradlew -v || true
echo "To build: ./gradlew :app:assembleDebug"
