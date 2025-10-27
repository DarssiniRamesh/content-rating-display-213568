#!/bin/sh
set -e
echo "Assembling and installing Android TV app..."
./gradlew :app:assembleDebug :app:installDebug
echo "Done. Launch on TV: org.example.app.tv.TvIndexActivity"
