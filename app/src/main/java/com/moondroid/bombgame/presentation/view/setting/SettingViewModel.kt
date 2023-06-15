package com.moondroid.bombgame.presentation.view.setting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moondroid.bombgame.utils.Constants
import com.moondroid.bombgame.utils.Preferences

class SettingViewModel : ViewModel() {
    val charIndex = MutableLiveData<Int>()
    val initial = MutableLiveData<Boolean>()
    val association = MutableLiveData<Boolean>()
    val question = MutableLiveData<Boolean>()
    val lastWord = MutableLiveData<Boolean>()

    init {
        charIndex.value = Preferences.getCharacter()
        initial.value = Preferences.getGame(Constants.GameType.Initial)
        association.value = Preferences.getGame(Constants.GameType.Association)
        question.value = Preferences.getGame(Constants.GameType.Question)
        lastWord.value = Preferences.getGame(Constants.GameType.LastWord)
    }

    fun changeChar(index: Int) {
        if (index != charIndex.value) {
            Preferences.setCharacter(index)
            charIndex.value = index
        }
    }
}