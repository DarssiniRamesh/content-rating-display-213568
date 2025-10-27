#!/bin/sh
set -e
echo "Running local Android build from $(pwd)"
./gradlew clean build
echo "Done."
