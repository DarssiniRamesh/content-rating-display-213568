#!/usr/bin/env bash
# Build the Android TV app from repository root.
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:assembleDebug
