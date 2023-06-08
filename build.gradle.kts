buildscript {
    val kotlinVersion = "1.8.20"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}


plugins {
    val kotlinVersion = "1.8.20"
    id ("com.android.application") version "8.0.1" apply false
    id ("org.jetbrains.kotlin.android") version kotlinVersion apply false
    id ("org.jetbrains.kotlin.kapt") version kotlinVersion apply false
    id ("androidx.navigation.safeargs") version "2.5.3" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}