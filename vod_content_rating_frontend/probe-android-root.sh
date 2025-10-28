#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
echo "ANDROID_WORKSPACE=$ROOT"
if [ -x "$ROOT/gradlew" ]; then
  echo "GRADLE_WRAPPER=$ROOT/gradlew"
  echo "SETTINGS_FILE=$ROOT/settings.gradle.dcl"
  echo "APP_MANIFEST=$ROOT/app/src/main/AndroidManifest.xml"
  echo "BUILD_CMD=cd $ROOT && ./gradlew :app:assembleDebug"
  exit 0
else
  echo "Gradle wrapper not found at $ROOT/gradlew" >&2
  exit 2
fi
