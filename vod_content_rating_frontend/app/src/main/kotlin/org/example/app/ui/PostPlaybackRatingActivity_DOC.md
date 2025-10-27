# PostPlaybackRatingActivity

Public interface:
- Extras: 
  - extra_content_id (String)
  - extra_display_time_sec (Int)
  - extra_playback_position_sec (Int)
  - extra_rolling_credits_sec (Int)
- Deep link: app://rating/postplay

Business rules:
- Skip if already rated
- Hide if playbackPos < rollingCredits
- Auto-close after display_time
- Show again after rewind before credits
- Missing keys: show key name (missing), empty -> preserve layout space

Focus:
- Default focus on Close button
- D-pad navigation set via nextFocus attributes in layout
