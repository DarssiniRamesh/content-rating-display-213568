#!/bin/sh
# Build using a root-level bridge settings file that includes nested modules.
set -e
SETTINGS_FILE="settings.gradle.bridge"
if [ ! -f "$SETTINGS_FILE" ]; then
  echo "Bridge settings file not found: $SETTINGS_FILE" >&2
  exit 1
fi
./gradlew -c "$SETTINGS_FILE" build
