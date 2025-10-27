Android TV Entrypoints

- Leanback launcher Activity: org.example.app.tv.TvIndexActivity
- Alias (LEANBACK_LAUNCHER): .TvLauncherAlias -> forwards to TvIndexActivity
- Additional overlays:
  - AndroidManifest.tv.launcher.xml
  - AndroidManifest.overlay.tv.xml
  - AndroidManifest.alias.launcher.xml

Build:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug
