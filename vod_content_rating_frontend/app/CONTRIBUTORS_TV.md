Contributors quick reference (Android TV)

Entry Activities:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.tv.TvInstructionsActivity

Layouts:
- res/layout-tv/activity_tv_index.xml
- res/layout-tv/activity_tv_instructions.xml

Assets (WebView):
- app/src/main/assets/ndice-41-135.html (+ ndice-41-135.css/js, common.css, app.js)
- app/src/main/assets/instrucciones-41-206.html (+ instrucciones-41-206.css/js, common.css, app.js)
- app/src/main/assets/figmaimages/*

Build:
- cd ../../ (project root: content-rating-display-213568/vod_content_rating_frontend)
- ./gradlew :app:assembleDebug

Notes:
- DPAD focus defaults to primary buttons; WebViews support page up/down via TvWebViewKeyHelper.
- Debug overlay manifest allows LAUNCHER start of TvIndexActivity for tooling.
