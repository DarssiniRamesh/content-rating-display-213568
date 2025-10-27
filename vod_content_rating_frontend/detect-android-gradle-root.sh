#!/usr/bin/env bash
set -euo pipefail
ROOT="content-rating-display-213568/vod_content_rating_frontend"
if [ -f "$ROOT/settings.gradle" ] || [ -f "$ROOT/settings.gradle.dcl" ]; then
  cd "$ROOT"
  pwd
  exit 0
else
  echo "Could not find Gradle settings in $ROOT" >&2
  exit 1
fi
