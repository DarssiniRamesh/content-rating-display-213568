#!/usr/bin/env bash
set -euo pipefail
exec ./gradlew -I gradle-print-modules.gradle printModules
