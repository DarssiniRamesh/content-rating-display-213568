#!/usr/bin/env bash
# Standard entrypoint for CI/analyzers to build the nested Android project.
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
exec ./gradlew :app:assembleDebug
