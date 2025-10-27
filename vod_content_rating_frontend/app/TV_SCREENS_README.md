TV Screens Overview

Screens:
- TvIndexActivity (LEANBACK_LAUNCHER)
  - Layout: res/layout-tv/activity_tv_index.xml
  - Loads: file:///android_asset/ndice-41-135.html
  - Primary action: "Continuar" -> TvInstructionsActivity
- TvInstructionsActivity
  - Layout: res/layout-tv/activity_tv_instructions.xml
  - Loads: file:///android_asset/instrucciones-41-206.html
  - Primary action: "Entendido" -> returns to TvIndexActivity (stub)

DPAD/Focus:
- Initial focus on primary buttons.
- WebViews support page up/down via TvWebViewKeyHelper and loop focus back to the primary action using nextFocus*.

Assets:
- app/src/main/assets/common.css, app.js
- app/src/main/assets/ndice-41-135.* and instrucciones-41-206.*
- app/src/main/assets/figmaimages/*
