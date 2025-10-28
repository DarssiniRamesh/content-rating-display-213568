#!/usr/bin/env bash
set -euo pipefail
echo "Delegating build to Android workspace wrapper …"
cd content-rating-display-213568/vod_content_rating_frontend
exec ./gradlew :app:assembleDebug
