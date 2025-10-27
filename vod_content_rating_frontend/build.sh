#!/usr/bin/env bash
set -euo pipefail
# Build script for the nested Android project (TV-enabled)
./gradlew --no-daemon :app:assembleDebug
