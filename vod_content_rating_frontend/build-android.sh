#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
if [ ! -d "$ROOT" ]; then
  echo "Android root not found at $ROOT" >&2
  exit 1
fi
cd "$ROOT"
./gradlew :app:assembleDebug
