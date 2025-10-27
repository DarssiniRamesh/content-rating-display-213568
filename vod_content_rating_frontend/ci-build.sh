#!/usr/bin/env bash
set -euo pipefail
echo "Navigating to Android Gradle root..."
cd content-rating-display-213568/vod_content_rating_frontend
echo "Running Gradle assembleDebug for :app..."
./gradlew :app:assembleDebug
echo "Build complete."
