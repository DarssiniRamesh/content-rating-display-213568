#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
echo "Building Android app via $ROOT/gradlew ..."
cd "$ROOT" && ./gradlew :app:assembleDebug
