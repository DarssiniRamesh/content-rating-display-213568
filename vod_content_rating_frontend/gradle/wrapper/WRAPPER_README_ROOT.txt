This repository provides a Gradle wrapper bridge at the root to aid discovery.
The actual wrapper JAR will be downloaded on first run into:
  gradle/wrapper/gradle-wrapper.jar

For building the Android app, run from repo root:
  ./gradlew :app:assembleDebug

Or change into the Android workspace:
  cd content-rating-display-213568/vod_content_rating_frontend
  ./gradlew :app:assembleDebug
