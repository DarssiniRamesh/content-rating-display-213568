#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
if [ ! -x "./gradlew" ]; then
  echo "Gradle wrapper not found in $(pwd)" >&2
  exit 1
fi
./gradlew --version
./gradlew :app:assembleDebug --stacktrace --no-daemon --warning-mode=all
