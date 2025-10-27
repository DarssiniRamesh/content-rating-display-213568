#!/usr/bin/env bash
set -euo pipefail
echo "Changing to Android workspace: content-rating-display-213568/vod_content_rating_frontend"
cd content-rating-display-213568/vod_content_rating_frontend
echo "Running Gradle assembleDebug for :app"
exec ./gradlew :app:assembleDebug
