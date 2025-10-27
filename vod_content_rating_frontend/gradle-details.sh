#!/usr/bin/env bash
set -euo pipefail
echo "Gradle version:"
./gradlew --version || true
echo "Projects:"
./gradlew projects || true
echo "Tasks (app):"
./gradlew :app:tasks --all || true
