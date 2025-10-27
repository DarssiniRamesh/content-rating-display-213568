QA Notes - Android TV

Launch:
- On Android TV, app icon opens TvIndexActivity (Leanback launcher).
- Navigate with DPAD. Primary action focuses by default.

Focus:
- Buttons use @drawable/focus_ring_primary_tv for a strong TV-visible focus state.
- WebViews accept DPAD focus. Links inside HTML are navigable via DPAD.

Navigation:
- Índice -> press "Continuar" -> Instrucciones.
- Instrucciones -> press "Entendido" -> returns to Índice (stub next step).

Build:
- From project root: cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
