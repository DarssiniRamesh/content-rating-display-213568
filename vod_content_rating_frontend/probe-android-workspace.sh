#!/usr/bin/env bash
set -euo pipefail
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
echo "ANDROID_WORKSPACE=content-rating-display-213568/vod_content_rating_frontend"
echo "GRADLE_WRAPPER=${ROOT_DIR}/content-rating-display-213568/vod_content_rating_frontend/gradlew"
echo "SETTINGS_DCL=${ROOT_DIR}/content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl"
echo "ASSEMBLE_TASK=:app:assembleDebug"
