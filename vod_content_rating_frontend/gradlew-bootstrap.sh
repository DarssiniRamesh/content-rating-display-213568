#!/usr/bin/env bash
# Bootstrap script to ensure Gradle wrapper is available at repo root, then delegate to nested Android project.
set -euo pipefail
if [ ! -f "gradle/wrapper/gradle-wrapper.properties" ]; then
  mkdir -p gradle/wrapper
  cat > gradle/wrapper/gradle-wrapper.properties <<'EOF'
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-9.0.0-bin.zip
networkTimeout=10000
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
EOF
fi
cd content-rating-display-213568/vod_content_rating_frontend
exec ./gradlew "$@"
