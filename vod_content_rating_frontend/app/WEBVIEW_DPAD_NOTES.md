WebView DPAD Handling

- TV Activities add an OnKeyListener to WebView to translate DPAD UP/DOWN into window.scrollBy calls.
- The HTML wrappers already include tv-dpad-scroll.js to handle Arrow keys; the native fallback ensures consistent behavior if the JS is blocked or slow to load.
- Adjust scroll step by changing the 120 value in TvIndexActivity/TvInstructionsActivity if needed for different content density.
