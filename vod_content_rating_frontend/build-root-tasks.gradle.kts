tasks.register("printAndroidWorkspace") {
    group = "help"
    description = "Prints the canonical Android workspace root and wrapper path."
    doLast {
        println("ANDROID_WORKSPACE=content-rating-display-213568/vod_content_rating_frontend")
        println("ANDROID_WRAPPER=content-rating-display-213568/vod_content_rating_frontend/gradlew")
        println("BUILD_CMD=cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug")
    }
}
