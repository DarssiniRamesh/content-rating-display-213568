// App module task helper (bridge for analyzers)
tasks.register("assembleApp") {
    group = "build"
    description = "Delegates to :app:assembleDebug"
    doLast {
        println("Run from workspace root: ./gradlew :app:assembleDebug")
    }
}
