#!/usr/bin/env bash
set -euo pipefail
cat <<'EOF'
Android workspace build help:
- ./gradlew :app:assembleDebug
- ./gradlew clean
Modules: :app, :list, :utilities
EOF
