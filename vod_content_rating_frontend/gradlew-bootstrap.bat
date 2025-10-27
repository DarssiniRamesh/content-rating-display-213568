@echo off
REM Bootstrap Gradle wrapper at repo root, then delegate to nested Android project.
IF NOT EXIST gradle\wrapper\gradle-wrapper.properties (
  mkdir gradle\wrapper 2> NUL
  > gradle\wrapper\gradle-wrapper.properties echo distributionBase=GRADLE_USER_HOME
  >> gradle\wrapper\gradle-wrapper.properties echo distributionPath=wrapper/dists
  >> gradle\wrapper\gradle-wrapper.properties echo distributionUrl=https\://services.gradle.org/distributions/gradle-9.0.0-bin.zip
  >> gradle\wrapper\gradle-wrapper.properties echo networkTimeout=10000
  >> gradle\wrapper\gradle-wrapper.properties echo validateDistributionUrl=true
  >> gradle\wrapper\gradle-wrapper.properties echo zipStoreBase=GRADLE_USER_HOME
  >> gradle\wrapper\gradle-wrapper.properties echo zipStorePath=wrapper/dists
)
cd content-rating-display-213568/vod_content_rating_frontend
call gradlew.bat %*
