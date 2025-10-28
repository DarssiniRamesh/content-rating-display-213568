@echo off
setlocal
set BASE_DIR=%~dp0
set WRAPPER_JAR=%BASE_DIR%content-rating-display-213568\vod_content_rating_frontend\gradle\wrapper\gradle-wrapper.jar
if not exist "%WRAPPER_JAR%" (
  echo Wrapper jar not found at %WRAPPER_JAR% 1>&2
  exit /b 1
)
set JAVA_BIN=%JAVA_HOME%\bin\java.exe
if not exist "%JAVA_BIN%" set JAVA_BIN=java
"%JAVA_BIN%" -Xms64m -Xmx1024m -Dorg.gradle.appname=gradlew -classpath "%WRAPPER_JAR%" org.gradle.wrapper.GradleWrapperMain %*
endlocal
