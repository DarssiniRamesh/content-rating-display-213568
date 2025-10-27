Android TV-first app (nested Gradle project)

Overview
- TV entry Activity (LEANBACK_LAUNCHER): org.example.app.tv.TvIndexActivity
- Mobile entry Activity (MAIN/LAUNCHER): org.example.app.TvSplashRedirectActivity (redirects based on TV feature)
- Screens implemented:
  1) Índice (41:135) via WebView
  2) Instrucciones (41:206) via WebView
- DPAD navigation:
  - Native buttons are focusable with visible focus ring
  - WebViews accept DPAD paging via TvWebViewKeyHelper (Up/Down scroll ~80% page)
  - HTML assets include tabindex/ARIA to expose focusable regions for TV remotes

Where to run
- Nested project root: content-rating-display-213568/vod_content_rating_frontend
- Build: ./gradlew :app:assembleDebug
- Install (if emulator/device connected): ./gradlew :app:installDebug

Key files
- AndroidManifest.xml: TV uses-feature, LEANBACK_LAUNCHER, splash redirect
- layout-tv/: activity_tv_index.xml, activity_tv_instructions.xml (overscan-safe)
- tv helpers: TvWebViewConfigurator, TvHardwareAccel, TvWebViewKeyHelper, TvBackHandler
- assets: app/src/main/assets/ndice-41-135.html, instrucciones-41-206.html (+ CSS/JS, images)
- focus visuals: res/drawable/focus_ring.xml

Dependencies (explicit versions)
- androidx.leanback:leanback:1.2.0-alpha05
- androidx.leanback:leanback-preference:1.2.0-alpha05
- androidx.tvprovider:tvprovider:1.1.0-alpha01
- androidx.webkit:webkit:1.10.0

Notes
- Hardware acceleration enabled at app level
- WebView uses file:///android_asset URLs
- Themes and TV-specific resources are under values-tv/
