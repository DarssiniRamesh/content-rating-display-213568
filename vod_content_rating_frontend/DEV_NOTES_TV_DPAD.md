TV DPAD Testing Notes

- On launch, TvSplashRedirectActivity routes TVs to TvIndexActivity (also LEANBACK_LAUNCHER).
- DPAD navigation:
  - Buttons: visible focus ring, Enter/Center triggers actions.
  - WebView: Up/Down scroll (page-step) via TvWebViewKeyHelper; HTML assets have tabindex/ARIA for focusable content.
- Overscan: layout-tv uses generous padding (48dp outer) to avoid clipping on different TVs.
- If focus seems lost inside WebView, press Back once to return focus to the native button.
