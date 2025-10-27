TV WebView Assets

This directory contains HTML/CSS/JS used by the Android TV app:
- ndice-41-135.html (Índice)
- instrucciones-41-206.html (Instrucciones)
- common.css, app.js, and referenced images under figmaimages/

Usage:
The TV activities (TvIndexActivity, TvInstructionsActivity) load these via:
  file:///android_asset/<file>

Ensure all referenced images and scripts are present under this assets directory.
