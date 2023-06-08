package com.moondroid.bombgame.utils

import android.content.Context
import android.content.SharedPreferences

object Preferences {
    private lateinit var preferences: SharedPreferences
    private const val PREF_NAME = "moondroid_bomb_game"

    object Key {
        const val CHARACTER = "KEY_CHARACTER"
        const val GAME01 = "KEY_GAME01"
        const val GAME02 = "KEY_GAME02"
        const val GAME03 = "KEY_GAME03"
    }

    fun init(context: Context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    private fun getString(key: String, defVal: String = ""): String {
        return preferences.getString(key, defVal) ?: defVal
    }

    private fun putString(key: String, value: String) {
        preferences.edit().putString(key, value).apply()
    }

    private fun getBoolean(key: String, defVal: Boolean = false): Boolean {
        return preferences.getBoolean(key, defVal)
    }

    private fun putBoolean(key: String, value: Boolean) {
        preferences.edit().putBoolean(key, value).apply()
    }

    private fun getInt(key: String, defVal: Int = 0): Int {
        return preferences.getInt(key, defVal)
    }

    private fun putInt(key: String, value: Int) {
        preferences.edit().putInt(key, value).apply()
    }

    fun getCharacter(): Int = getInt(Key.CHARACTER, 1)
    fun setCharacter(index: Int) = putInt(Key.CHARACTER, index)

    fun getGame01() : Boolean = getBoolean(Key.GAME01, true)
    fun setGame01(boolean: Boolean) = putBoolean(Key.GAME01, boolean)

    fun getGame02() : Boolean = getBoolean(Key.GAME02, true)
    fun setGame02(boolean: Boolean) = putBoolean(Key.GAME02, boolean)

    fun getGame03() : Boolean = getBoolean(Key.GAME03, true)
    fun setGame03(boolean: Boolean) = putBoolean(Key.GAME03, boolean)

}