@echo off
REM Bridge gradlew for discovery tools. Delegates to workspace wrapper.
cd content-rating-display-213568/vod_content_rating_frontend
call gradlew.bat %*
