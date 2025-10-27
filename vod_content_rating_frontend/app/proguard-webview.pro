# Keep any classes annotated with @JavascriptInterface (safety for TV WebView interactions)
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}
# Keep WebView clients in tv package
-keep class org.example.app.tv.*WebView* { *; }
