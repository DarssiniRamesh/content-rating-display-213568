#!/usr/bin/env bash
# POSIX shell shim for environments invoking 'bash gradlew.sh'
set -euo pipefail
exec ./gradlew "$@"
