#!/usr/bin/env bash
set -euo pipefail
# Delegate to Android Gradle root
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:assembleDebug
