#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
cd "$ROOT"
exec ./gradlew "$@"
