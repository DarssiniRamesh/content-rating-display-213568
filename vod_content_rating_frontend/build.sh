#!/usr/bin/env bash
set -euo pipefail
# Helper script for analyzers and humans. Uses Gradle Declarative wrapper.
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$DIR"
exec ./gradlew :app:assembleDebug
