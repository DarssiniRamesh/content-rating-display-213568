Android SDK Path

- Do not hardcode sdk.dir in local.properties in source control.
- CI should set ANDROID_SDK_ROOT (or ANDROID_HOME) environment variable.
- This project provides local.properties as a placeholder to help some tools recognize the Android project root, but without a fixed path.
