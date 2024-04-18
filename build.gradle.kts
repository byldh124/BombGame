buildscript {
    val kotlinVersion = "1.8.20"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.5")
    }
}


plugins {
    val kotlinVersion = "1.8.20"
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false
    id("org.jetbrains.kotlin.kapt") version kotlinVersion apply false
    id("androidx.navigation.safeargs") version "2.5.3" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("com.google.firebase.crashlytics") version "2.9.5" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}