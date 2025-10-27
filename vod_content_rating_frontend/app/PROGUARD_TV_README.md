ProGuard rules for TV/WebView

The proguard-rules.pro includes:
-keep class org.example.app.tv.** { *; }
-keepclassmembers class * extends android.webkit.WebView { *; }
-dontwarn android.webkit.**

Rationale:
- TV Activities often interact with WebView and may rely on reflection for internal WebView behavior or JS bridges. Keeping these avoids runtime issues in release builds.
- Update rules as TV features evolve.
