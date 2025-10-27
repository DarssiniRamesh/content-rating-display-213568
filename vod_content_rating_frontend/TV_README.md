Android TV notes

- TV entry activity: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- From Índice, press the “Continuar” button to navigate to Instrucciones.
- From Instrucciones, press “Entendido” to return to Índice (stub for next step).
- WebView content is loaded from app/src/main/assets using file:///android_asset URLs.
- DPAD up/down scrolls the WebView by a page step (≈80% of viewport).
- Overscan-safe margins and large text are used in layout-tv/ resources.
