#!/usr/bin/env bash
set -euo pipefail
# Uses the repository root Gradle bridge (settings.gradle with :appRoot mapping)
exec ./gradlew :appRoot:assembleDebug
