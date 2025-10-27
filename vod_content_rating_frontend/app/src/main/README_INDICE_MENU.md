# Índice Overflow Menu (QA)

Menu resource: res/menu/menu_indice.xml

Items:
- action_start_playback: Launches PlaybackActivity directly using a demo contentId ("prototype_1").
- action_reset_session: Shows a toast confirming reset for the preview flow.

How to open:
- In ÍndiceActivity, open the overflow menu (⋮) and choose an option.

Notes:
- Use this to jump straight into Playback and trigger the Post-Playback Rating panel after simulated credits.
- Session reset is preview-only; real persistence would be provided by a storage layer.
