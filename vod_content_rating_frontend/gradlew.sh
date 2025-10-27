#!/usr/bin/env bash
set -euo pipefail
# Shim to ensure a gradle wrapper entry point exists for discovery tools.
exec ./gradlew "$@"
