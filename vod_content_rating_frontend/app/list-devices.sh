#!/bin/sh
set -e
echo "Listing Android devices via adb:"
adb devices -l || true
echo "Tip: Use ./gradlew :app:installDebug to deploy."
