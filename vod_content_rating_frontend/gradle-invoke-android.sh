#!/usr/bin/env bash
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
exec ./gradlew :app:assembleDebug
