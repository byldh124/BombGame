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
            2 -> "연상 퀴즈"
            3 -> "질문 게임"
            else -> "초성 퀴즈"
        }
    }

    @BindingAdapter("description")
    @JvmStatic
    fun TextView.setTypeDescription(gameType: Int) {
        text = when(gameType) {
            2 -> "제시어를 보고 연상 되는 단어를 말해 보세요."
            3 -> "질문에 답하고 옆 사람에게 다른 질문을 해 보세요. "
            else -> "다음 초성을 보고 단어를 만들어 보세요."
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
                val first = Random.nextInt(list.lastIndex)
                val second = if (first > 8) {
                    Random.nextInt(8)
                } else {
                    Random.nextInt(list.lastIndex)
                }
                list[first] + list[second]
            }
        }
    }
}