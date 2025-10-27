#!/usr/bin/env bash
set -euo pipefail
# Directly invoke the Android workspace Gradle wrapper JAR using the local Java runtime.
WRAP_JAR="content-rating-display-213568/vod_content_rating_frontend/gradle/wrapper/gradle-wrapper.jar"
if [ ! -f "$WRAP_JAR" ]; then
  echo "Wrapper jar not found at $WRAP_JAR" >&2
  exit 1
fi
exec java -jar "$WRAP_JAR" "$@"
