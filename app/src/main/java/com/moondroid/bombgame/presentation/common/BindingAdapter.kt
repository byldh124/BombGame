package com.moondroid.bombgame.presentation.common

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.airbnb.lottie.LottieAnimationView
import com.moondroid.bombgame.R
import com.moondroid.bombgame.utils.Constants
import com.moondroid.bombgame.utils.Constants.GameType
import com.moondroid.bombgame.utils.Extension.visible
import kotlin.random.Random

object BindingAdapter {
    @BindingAdapter("visible")
    @JvmStatic
    fun View.setVisible(isVisible: Boolean) {
        visible(isVisible)
    }

    @BindingAdapter("playAnim")
    @JvmStatic
    fun LottieAnimationView.playAnim(anim: Boolean) {
        if (anim) playAnimation() else cancelAnimation()
    }

    @BindingAdapter("title")
    @JvmStatic
    fun TextView.setTypeTitle(gameType: GameType) {
        text = when(gameType) {
            GameType.Initial -> context.getString(R.string.cmn_initial_game)
            GameType.Association -> context.getString(R.string.cmn_association_game)
            GameType.Question -> context.getString(R.string.cmn_question_game)
            GameType.LastWord -> context.getString(R.string.cmn_last_word_game)
        }
    }

    @BindingAdapter("description")
    @JvmStatic
    fun TextView.setTypeDescription(gameType: GameType) {
        text = when(gameType) {
            GameType.Initial -> context.getString(R.string.cmn_desc_initial)
            GameType.Association -> context.getString(R.string.cmn_desc_association)
            GameType.Question -> context.getString(R.string.cmn_desc_questIon)
            GameType.LastWord -> context.getString(R.string.cmn_desc_last_word)
        }
    }

    @BindingAdapter("quiz")
    @JvmStatic
    fun TextView.setTypeQuiz(gameType: GameType) {
        text = when(gameType) {
            GameType.Initial -> {
                val list = context.resources.getStringArray(R.array.game_initial)
                list[Random.nextInt(list.size)] + list[Random.nextInt(list.size)]
            }
            GameType.Association -> {
                val list = context.resources.getStringArray(R.array.game_association)
                list[Random.nextInt(list.lastIndex)]
            }
            GameType.Question -> {
                val list = context.resources.getStringArray(R.array.game_question)
                list[Random.nextInt(list.lastIndex)]
            }
            GameType.LastWord -> {
                val list = context.resources.getStringArray(R.array.game_last_word)
                list[Random.nextInt(list.lastIndex)]
            }
        }
    }
}