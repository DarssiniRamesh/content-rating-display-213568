#!/bin/sh
set -e
echo "Listing Gradle projects from nested root: $(pwd)"
./gradlew -q projects
