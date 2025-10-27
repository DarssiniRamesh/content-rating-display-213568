#!/usr/bin/env bash
set -euo pipefail
echo "Android Gradle root: $(pwd)"
./gradlew :app:assembleDebug
./gradlew test
echo "Build and tests completed."
