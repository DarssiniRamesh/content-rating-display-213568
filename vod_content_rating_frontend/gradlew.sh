#!/usr/bin/env bash
# Internal wrapper shim to invoke the Gradle Wrapper in this directory.
set -euo pipefail

BASE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
WRAPPER="${BASE_DIR}/gradle/wrapper/gradle-wrapper.jar"
PROPS="${BASE_DIR}/gradle/wrapper/gradle-wrapper.properties"

if [[ ! -f "$WRAPPER" ]]; then
  echo "Gradle wrapper JAR not found at $WRAPPER"
  exit 1
fi

JAVA_BIN="${JAVA_HOME:-}/bin/java"
if [[ ! -x "$JAVA_BIN" ]]; then
  JAVA_BIN="java"
fi

exec "$JAVA_BIN" -Xms64m -Xmx1024m -Dorg.gradle.appname=gradlew -classpath "$WRAPPER" org.gradle.wrapper.GradleWrapperMain "$@"
