#!/usr/bin/env bash
set -euo pipefail
./gradlew -I gradle-print-modules.gradle printModules
./gradlew :app:assembleDebug
