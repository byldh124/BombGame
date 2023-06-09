package com.moondroid.bombgame.utils.firebase

import com.google.firebase.crashlytics.FirebaseCrashlytics

object FBCrash {
    private val crashlytics = FirebaseCrashlytics.getInstance()

    fun logException(t: Throwable) {
        try {
            val message = t.stackTraceToString()
            crashlytics.log("[logException]::$message")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}