#!/usr/bin/env bash
set -euo pipefail
ROOT_JSON=".android-gradle-locator.json"
if [[ ! -f "$ROOT_JSON" ]]; then
  echo "Locator JSON not found: $ROOT_JSON" >&2
  exit 1
fi
GRADLE_ROOT=$(jq -r '.gradleProjectRoot' "$ROOT_JSON")
WRAPPER=$(jq -r '.gradleWrapper' "$ROOT_JSON")
TASKS=$(jq -r '.buildTasks | join(" ")' "$ROOT_JSON")
cd "$GRADLE_ROOT"
exec "./$(basename "$WRAPPER")" $TASKS
