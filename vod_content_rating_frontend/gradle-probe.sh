#!/usr/bin/env bash
set -euo pipefail
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -x "$DIR/gradlew" ]; then
  echo "Gradle wrapper: $DIR/gradlew"
  "$DIR/gradlew" -v || true
  echo "Try: $DIR/gradlew :app:assembleDebug"
else
  echo "Wrapper not found at $DIR/gradlew" >&2
  exit 2
fi
