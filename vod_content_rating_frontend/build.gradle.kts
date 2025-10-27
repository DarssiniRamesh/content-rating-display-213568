plugins {
    base
}
tasks.register("assembleDebug") {
    dependsOn(":app:assembleDebug")
}
tasks.register("buildAll") {
    dependsOn(":build")
}
