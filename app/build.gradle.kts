import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("org.jetbrains.kotlin.kapt")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

val properties = gradleLocalProperties(rootDir)

android {
    namespace = "com.moondroid.bombgame"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.moondroid.bombgame"
        minSdk = 23
        targetSdk = 34
        versionCode = 5
        versionName = "1.0.5"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        val googleAdsAppId: String = properties.getProperty("google.ads.app.id")
        manifestPlaceholders["googleAdsAppId"] = googleAdsAppId
    }

    buildTypes {
        debug {
            resValue("string", "banner_id", "ca-app-pub-3940256099942544/6300978111")
            resValue("string", "foreground_id", "ca-app-pub-3940256099942544/1033173712")
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            val bannerId: String = properties.getProperty("google.ads.banner.id")
            val foregroundId: String = properties.getProperty("google.ads.foreground.id")

            resValue("string", "banner_id", bannerId)
            resValue("string", "foreground_id", foregroundId)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation("com.google.android.gms:play-services-ads:23.3.0")

    implementation("com.google.android.play:review-ktx:2.0.1")

    implementation("androidx.activity:activity-ktx:1.9.1")
    implementation("androidx.fragment:fragment-ktx:1.8.2")

    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.google.code.gson:gson:2.11.0")

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:2.7.7")
    implementation("com.google.android.play:feature-delivery-ktx:2.1.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11")

    //firebase
    implementation(platform("com.google.firebase:firebase-bom:33.2.0"))
    implementation("com.google.firebase:firebase-crashlytics-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")

    implementation("com.airbnb.android:lottie:6.3.0")
}