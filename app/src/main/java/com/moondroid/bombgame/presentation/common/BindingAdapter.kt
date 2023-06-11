package com.moondroid.bombgame.presentation.common

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.airbnb.lottie.LottieAnimationView
import com.moondroid.bombgame.R
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
    fun TextView.setTypeTitle(gameType: Int) {
        text = when(gameType) {
            2 -> context.getString(R.string.cmn_association_game)
            3 -> context.getString(R.string.cmn_question_game)
            else -> context.getString(R.string.cmn_initial_game)
        }
    }

    @BindingAdapter("description")
    @JvmStatic
    fun TextView.setTypeDescription(gameType: Int) {
        text = when(gameType) {
            2 -> context.getString(R.string.cmn_desc_association)
            3 -> context.getString(R.string.cmn_desc_questIon)
            else -> context.getString(R.string.cmn_desc_initial)
        }
    }

    @BindingAdapter("quiz")
    @JvmStatic
    fun TextView.setTypeQuiz(gameType: Int) {
        text = when(gameType) {
            2 -> {
                val list = context.resources.getStringArray(R.array.game02)
                list[Random.nextInt(list.lastIndex)]
            }
            3 -> {
                val list = context.resources.getStringArray(R.array.game03)
                list[Random.nextInt(list.lastIndex)]
            }
            else -> {
                val list = context.resources.getStringArray(R.array.game01)
                list[Random.nextInt(list.size)] + list[Random.nextInt(list.size)]
            }
        }
    }
}