@ECHO OFF
SETLOCAL ENABLEDELAYEDEXPANSION

SET WRAPPER_JAR=gradle\wrapper\gradle-wrapper.jar

IF NOT EXIST "%WRAPPER_JAR%" (
  ECHO Gradle wrapper jar not found at %WRAPPER_JAR%.
  ECHO Please run fetch-wrapper.sh or use the repository root wrapper.
  EXIT /B 1
)

IF DEFINED JAVA_HOME (
  SET "JAVA_EXE=%JAVA_HOME%\bin\java.exe"
) ELSE (
  SET "JAVA_EXE=java.exe"
)

"%JAVA_EXE%" -classpath "%WRAPPER_JAR%" org.gradle.wrapper.GradleWrapperMain %*
ENDLOCAL
