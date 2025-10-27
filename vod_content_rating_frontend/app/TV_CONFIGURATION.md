Android TV Configuration Summary

- Leanback launcher: org.example.app.tv.TvIndexActivity
- Uses-feature: android.software.leanback (not required), android.hardware.touchscreen=false
- Focus styles: @drawable/focus_ring, @drawable/focus_ring_primary_tv, @drawable/focus_ring_surface
- Layouts: res/layout-tv/activity_tv_index.xml, res/layout-tv/activity_tv_instructions.xml
- Themes: values-tv/themes.xml with Theme.VodCalificador.TV, alias AppTheme.TV
- WebView assets mounted under src/main/assets with DPAD scroll helper
- Manifest overlays: AndroidManifest.overlay.tv.xml, AndroidManifest.alias.launcher.xml, AndroidManifest.alias.mobile.xml

Build:
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
