# Post-Playback Rating: Business Rules (Developer Notes)

- Skip if already rated (session-based store).
- Don't show if playback position < rollingCreditsTimeSec.
- Auto-close after display_time (max 60s, min 1s).
- Show again if the user rewinds before rollingCreditsTime and then reaches credits again (caller relaunch).
- Missing/Empty keys:
  - Missing => Show the key name literal (e.g., "content_title").
  - Empty   => Leave the space blank, preserving layout sizing.
- Default focus on Close button (D-pad flow priority).
- Return to PlaybackActivity upon Close, or route to VcardActivity after rating (placeholder).
