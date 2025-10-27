#!/bin/bash
cd /home/kavia/workspace/code-generation/content-rating-display-213568/vod_content_rating_frontend
./gradlew lint
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

