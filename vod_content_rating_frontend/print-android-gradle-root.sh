#!/usr/bin/env bash
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew -I gradle-self-check.gradle printProjectDir
