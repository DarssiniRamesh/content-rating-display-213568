# Navigation Summary

Entrypoints
- AliasMainActivity (launcher) -> forwards to ÍndiceActivity
- ÍndiceActivity -> InstruccionesActivity (CTA) or PlaybackActivity (QA actions)
- PlaybackActivity -> auto-opens PostPlaybackRatingActivity after credits timing
- PostPlaybackRatingActivity -> Close returns to Playback; rating submission returns to Playback (or Vcard placeholder)

Help
- res/raw/post_playback_help.txt
