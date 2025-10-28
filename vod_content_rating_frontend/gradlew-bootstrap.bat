@echo off
setlocal enabledelayedexpansion
set ANDROID_DIR=content-rating-display-213568\vod_content_rating_frontend
if exist "%ANDROID_DIR%\gradlew.bat" (
  pushd "%ANDROID_DIR%"
  call gradlew.bat %*
  set EXITCODE=%ERRORLEVEL%
  popd
  exit /b %EXITCODE%
) else (
  echo Android Gradle wrapper not found at %ANDROID_DIR%\gradlew.bat
  exit /b 1
)
endlocal
