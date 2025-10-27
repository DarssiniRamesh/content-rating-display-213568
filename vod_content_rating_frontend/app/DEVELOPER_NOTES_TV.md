Android TV quick start

- Launch Activity (TV): org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- Navigation: DPAD selects the primary yellow button on the Índice to proceed to Instrucciones; on Instrucciones, "Entendido" returns to Index (stub for next step).
- Assets are served via WebView from app/src/main/assets:
  - ndice-41-135.html (+ common.css, ndice-41-135.css/js, app.js)
  - instrucciones-41-206.html (+ common.css, instrucciones-41-206.css/js, app.js)
  - figmaimages/ used by both pages.
- Build from module root:
  cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
