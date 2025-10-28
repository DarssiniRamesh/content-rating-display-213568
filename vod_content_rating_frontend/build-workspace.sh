#!/usr/bin/env bash
set -euo pipefail
echo "Android workspace: $(pwd)"
echo "Running: ./gradlew :app:assembleDebug"
exec ./gradlew :app:assembleDebug
