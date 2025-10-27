QA checklist (Android TV)

- Launch app on TV/emulator
  - From Home, select the app tile labeled "VOD Rating TV"
  - TvIndexActivity should open (LEANBACK_LAUNCHER)
- Focus and DPAD
  - On Index, initial focus on "Continuar"; press Enter to go to Instrucciones
  - On Instrucciones, initial focus on "Entendido"
  - DPAD Up/Down scrolls the WebView content (page-wise)
- Assets
  - Verify images load on Instrucciones and Index screens
- Back behavior
  - Press Back on any TV screen should return/exit appropriately
