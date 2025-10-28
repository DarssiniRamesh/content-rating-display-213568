tasks.register("help") {
    group = "help"
    description = "Alias module; the real Android app module is under vod_content_rating_frontend/app."
    doLast {
        println("Use: ./gradlew :app:assembleDebug")
    }
}
