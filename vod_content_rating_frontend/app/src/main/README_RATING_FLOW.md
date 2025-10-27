# Rating Flow and Session Rules

Flow:
1. ÍndiceActivity -> InstruccionesActivity (acknowledge) -> PlaybackActivity (simulates credits) -> PostPlaybackRatingActivity.
2. PostPlaybackRatingActivity routes back to PlaybackActivity (or Vcard placeholder in future).

Business rules (enforced in PostPlaybackRatingActivity + Repository):
- Skip if contentId missing or already rated (session-based).
- Do not show if playback position < rollingCreditsTime.
- Auto-close after `display_time` (1..60s, default 10s).
- If user rewinds before credits and reaches credits again, caller can relaunch.

Session persistence:
- org.example.app.data.SessionLikesStore keeps rated contentIds for the current app session.
- Repository.hasUserRated delegates to SessionLikesStore.
- Repository.sendRating marks contentId in SessionLikesStore on success.

Edge-case handling:
- Missing title/invitation -> show key name literal.
- Empty title/invitation -> render as blank but preserve layout sizing.
- Default focus on “Close”; D-pad navigation wired in layout.

Testing:
- Use contentId suffixes: “…missing”, “…empty” to test key handling.
- Dev utilities: DevLaunchRatingActivity, DevRewindPlaybackActivity
