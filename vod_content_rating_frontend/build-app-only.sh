#!/bin/sh
set -e
echo "Assembling :app only..."
./gradlew :app:clean :app:assembleDebug
echo "Done."
