#!/usr/bin/env bash
# Build and install the Android TV app from repository root.
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:assembleDebug :app:installDebug
echo "Installed TV app. You can launch with:"
echo "adb shell monkey -p org.gradle.experimental.android.app -c android.intent.category.LEANBACK_LAUNCHER 1"
