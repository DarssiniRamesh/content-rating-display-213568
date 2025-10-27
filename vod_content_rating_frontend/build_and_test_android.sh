#!/usr/bin/env bash
# Build and test the nested Android project without root discovery.
set -euo pipefail
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew clean build test
echo "Build and tests completed for nested Android project."
