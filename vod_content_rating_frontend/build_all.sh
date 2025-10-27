#!/usr/bin/env bash
set -euo pipefail
./gradlew clean :app:assembleDebug test
echo "Nested Android project built successfully."
