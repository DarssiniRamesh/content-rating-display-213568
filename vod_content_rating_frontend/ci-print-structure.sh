#!/usr/bin/env bash
set -euo pipefail
echo "Gradle root: $(pwd)"
echo "Settings file:"
if [ -f settings.gradle.dcl ]; then
  echo " - settings.gradle.dcl present"
elif [ -f settings.gradle.kts ] || [ -f settings.gradle ]; then
  echo " - Kotlin/Gradle settings present"
else
  echo " - No settings file found" >&2
  exit 2
fi
echo "Modules directory listing:"
ls -1 || true
echo "Module directories:"
for m in app list utilities; do
  if [ -d "$m" ]; then echo " - $m"; else echo " - $m (missing)"; fi
done
