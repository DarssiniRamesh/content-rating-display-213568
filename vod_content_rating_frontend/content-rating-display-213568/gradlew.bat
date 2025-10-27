@echo off
setlocal
set DIR=%~dp0
set ANDROID_DIR=%DIR%vod_content_rating_frontend
if exist "%ANDROID_DIR%\gradlew.bat" (
  call "%ANDROID_DIR%\gradlew.bat" %*
  exit /b %ERRORLEVEL%
) else (
  echo Wrapper not found under vod_content_rating_frontend.
  exit /b 1
)
endlocal
