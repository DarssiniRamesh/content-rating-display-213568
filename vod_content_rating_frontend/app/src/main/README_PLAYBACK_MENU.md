# Playback Overflow Menu

Menu resource: res/menu/menu_playback.xml

Items:
- action_reset_session: Resets the in-memory SessionLikesStore (session-rated flags), allowing the rating panel to show again on credits.

How to open:
- In PlaybackActivity, open the overflow menu (⋮) and choose “Restart session”.

Notes:
- PlaybackActivity extends AppCompatActivity for consistent menu handling with AndroidX appcompat.
