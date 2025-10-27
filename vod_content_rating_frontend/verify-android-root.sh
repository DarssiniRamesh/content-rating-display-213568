#!/bin/sh
# Verifies and prints the nested Android Gradle root for CI/analyzers.
ROOT="content-rating-display-213568/vod_content_rating_frontend"
if [ -d "$ROOT" ] && [ -f "$ROOT/gradlew" ]; then
  echo "Android Gradle root detected at: $ROOT"
  echo "Run: cd $ROOT && ./gradlew build"
  exit 0
else
  echo "Android Gradle root not found at: $ROOT" >&2
  exit 1
fi
