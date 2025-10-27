#!/bin/sh
set -e
echo "Android Gradle root: $(pwd)"
./gradlew -q projects
