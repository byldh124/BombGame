package com.moondroid.bombgame.presentation.view.setting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moondroid.bombgame.utils.Preferences

class SettingViewModel : ViewModel() {
    val charIndex = MutableLiveData<Int>()
    val game01 = MutableLiveData<Boolean>()
    val game02 = MutableLiveData<Boolean>()
    val game03 = MutableLiveData<Boolean>()

    init {
        charIndex.value = Preferences.getCharacter()
        game01.value = Preferences.getGame01()
        game02.value = Preferences.getGame02()
        game03.value = Preferences.getGame03()
    }

    fun changeChar(index: Int) {
        if (index != charIndex.value) {
            Preferences.setCharacter(index)
            charIndex.value = index
        }
    }
}