#!/usr/bin/env bash
set -euo pipefail
# Build and run unit + connected tests from Android root
./gradlew :app:clean :app:testDebugUnitTest :app:assembleDebug
# Run connected tests only if a device is connected
if adb get-state 1>/dev/null 2>&1; then
  ./gradlew :app:connectedDebugAndroidTest
else
  echo "No connected device/emulator detected; skipping connected tests."
fi
