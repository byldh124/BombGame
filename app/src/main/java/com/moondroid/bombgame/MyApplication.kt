package com.moondroid.bombgame

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.moondroid.bombgame.utils.Preferences
import com.moondroid.bombgame.utils.firebase.FBAnalyze

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        Preferences.init(applicationContext)
        FBAnalyze.init(applicationContext)
    }
}