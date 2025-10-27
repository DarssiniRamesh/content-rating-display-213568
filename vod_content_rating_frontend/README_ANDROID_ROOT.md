Android/Kotlin Project Location

The Android Gradle project for this repository is nested at:
- content-rating-display-213568/vod_content_rating_frontend

Build instructions:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew build

Notes for CI/Analyzers:
- Some tools require the Gradle root at repo root; pointers have been added:
  - settings.gradle (delegates to the nested settings.gradle.dcl)
  - settings.gradle.kts (prints hint)
  - build.gradle and gradle.properties (root markers)
If your tool still fails to detect the project, configure its working directory to the path above.
