#!/usr/bin/env bash
set -euo pipefail
# Run from Android Gradle root
if [ ! -f "./settings.gradle.dcl" ] && [ ! -f "./settings.gradle" ]; then
  echo "Please run from Android Gradle root: content-rating-display-213568/vod_content_rating_frontend" >&2
  exit 1
fi
./gradlew :app:tasks >/dev/null
echo "Android Gradle root verified at $(pwd)"
