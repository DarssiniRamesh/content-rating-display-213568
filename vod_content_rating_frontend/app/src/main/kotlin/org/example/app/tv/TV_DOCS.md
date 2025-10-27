# Android TV Flows and DPAD Patterns

Entry points:
- TvIndexActivity (LEANBACK_LAUNCHER): Loads Índice (41:135) via WebView
- TvInstructionsActivity: Loads Instrucciones (41:206); 'Entendido' returns to Index (stub for next flow)

Navigation:
- DPAD focus defaults to the primary button in each screen
- WebView configured for TV via WebViewTvUtils and TvWebViewHelper (DPAD-friendly)
- In Index, in-page CTA triggers `app://goto/instrucciones` which TvWebViewHelper blocks from external navigation and TV activity handles

Layout:
- Overscan-safe padding (values-tv/dimens.xml)
- Focus rings (drawable/focus_ring.xml) and container focus (drawable/tv_focus_container.xml)
- TV theme (values-tv/themes.xml)

Manifest:
- LEANBACK_LAUNCHER on TvIndexActivity
- Uses-feature leanback; touchscreen not required

Build:
- From Android Gradle root: ./gradlew :app:assembleDebug

Tests:
- androidTest includes launch/sanity tests for TV screens
