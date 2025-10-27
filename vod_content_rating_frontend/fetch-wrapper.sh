#!/usr/bin/env bash
set -euo pipefail
PROP="gradle/wrapper/gradle-wrapper.properties"
JAR="gradle/wrapper/gradle-wrapper.jar"

if [[ -f "$JAR" ]]; then
  echo "Wrapper jar already present."
  exit 0
fi

if [[ ! -f "$PROP" ]]; then
  echo "Wrapper properties not found at $PROP"
  exit 1
fi

URL=$(grep distributionUrl "$PROP" | sed -E 's/.*=//')
TMP=$(mktemp)
echo "Downloading Gradle wrapper from $URL ..."
curl -L "$URL" -o "$TMP"
mkdir -p gradle/wrapper
# Extract wrapper jar from distribution
unzip -p "$TMP" gradle/wrapper/gradle-wrapper.jar > "$JAR"
rm -f "$TMP"
echo "Wrapper jar installed at $JAR"
