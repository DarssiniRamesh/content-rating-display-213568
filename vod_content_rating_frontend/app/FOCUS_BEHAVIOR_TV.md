Focus behavior (Android TV)

- Initial focus: Primary button requests focus in each TV Activity after setContentView.
- DPAD paging: WebViews accept DPAD_UP / DPAD_DOWN to page via TvWebViewKeyHelper.
- Focus loop: nextFocusUp/Down for WebViews points back to the primary button.
- Visual indicator: Buttons use @style/TvButton.Primary (focus_ring_primary_tv.xml).
- Surface focus: WebView containers use @style/TvSurface.Focusable (focus_ring_surface.xml).
