@echo off
REM Root bootstrap Gradle wrapper: delegates to Android workspace wrapper
setlocal
cd content-rating-display-213568\vod_content_rating_frontend
call gradlew.bat %*
endlocal
