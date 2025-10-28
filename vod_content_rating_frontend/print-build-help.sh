#!/usr/bin/env bash
set -euo pipefail
cat <<'EOF'
Android workspace build help:
- Android project root: content-rating-display-213568/vod_content_rating_frontend
- Build: cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
- Launcher Activity: org.example.app.ui.AliasMainActivity
- Deep link: adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app
EOF
