#!/usr/bin/env bash
set -euo pipefail
BASE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
WRAPPER_JAR="$BASE_DIR/content-rating-display-213568/vod_content_rating_frontend/gradle/wrapper/gradle-wrapper.jar"
if [[ ! -f "$WRAPPER_JAR" ]]; then
  echo "Wrapper jar not found at $WRAPPER_JAR" >&2
  exit 1
fi
JAVA_BIN="${JAVA_HOME:-}/bin/java"
if [[ ! -x "$JAVA_BIN" ]]; then
  JAVA_BIN="java"
fi
exec "$JAVA_BIN" -Xms64m -Xmx1024m -Dorg.gradle.appname=gradlew -classpath "$WRAPPER_JAR" org.gradle.wrapper.GradleWrapperMain "$@"
