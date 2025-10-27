# Rating Layout Structure (activity_post_playback_rating.xml)

Root: FrameLayout
- posterBackground: full-screen ImageView (poster placeholder)
- grayOverlay: full-screen overlay (#88000000)
- foregroundCard: LinearLayout (vertical)
  - pipPlayerSurface: 200x112dp placeholder (focusable)
  - contentTitle: EG.Title, single-line, ellipsized
  - invitationCopy: EG.Body, multi-line
  - countdownRow: LinearLayout (horizontal)
    - countdownLabel: EG.Body (localized: rating_countdown_label)
    - countdownText: EG.Body (seconds, suffix handled in Activity for a11y)
  - actionsRow: LinearLayout (horizontal)
    - buttonLike, buttonLove, buttonDislike (EG.Button.Primary)
    - buttonClose (EG.Button.Primary, default focus)
    
Focus:
- Default focus on Close (also requested in onCreate).
- D-pad nextFocus links set for predictable navigation.

Business rules handled in PostPlaybackRatingActivity.
