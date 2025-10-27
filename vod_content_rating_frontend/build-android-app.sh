#!/usr/bin/env bash
# Build helper to assemble the Android app from repository root.
set -euo pipefail
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
"$SCRIPT_DIR/gradlew" :app:assembleDebug
echo "Build completed: app assembled (Debug)."
