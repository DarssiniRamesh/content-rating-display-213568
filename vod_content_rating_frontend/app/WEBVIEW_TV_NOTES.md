TV WebView Notes

- tv-webview.css provides a small set of GPU compositing hints (translateZ(0), backface-visibility) that can improve scrolling smoothness on Android TV.
- To apply in an HTML asset, include:
  <link rel="stylesheet" href="./tv-webview.css">
- Hardware acceleration is already enabled at the application level; these hints can further reduce jank with large, absolute-positioned content.
