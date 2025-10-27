# TV Troubleshooting (DPAD & WebView)

1) DPAD focus not visible
- Ensure focusable=true on the target view and a visible selector background.
- Buttons use @style/TvPrimaryButton with @drawable/focus_ring for a thick, TV-safe ring.

2) DPAD navigation gets stuck inside WebView
- WebViewTvUtils.configure(webView) enables DPAD and sets sensible defaults.
- In TvInstructionsActivity, DPAD up/down scrolls the page. Adjust setOnKeyListener as needed.

3) WebView content not loading
- Assets are copied to app/src/main/assets and loaded via file:///android_asset/... URLs.
- Network security is set to allow cleartext for local assets (android:networkSecurityConfig).

4) Leanback launcher not appearing
- Verify Android TV emulator image is API 30+ with TV (Android TV) system image.
- Manifest declares LEANBACK_LAUNCHER on TvIndexActivity and includes a tv banner.

5) Overscan/clipping on TV
- Layouts use values-tv/dimens.xml for tv_overscan_padding. Tune as needed per device.

Build from Android root:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew assembleDebug

Run on device/emulator:
- ./gradlew :app:installDebug
- Open from TV home (LEANBACK_LAUNCHER) or use MainActivity overflow "Open TV Index (debug)" on phones.
