package com.moondroid.bombgame.presentation.common

import android.view.View
import androidx.databinding.BindingAdapter
import com.airbnb.lottie.LottieAnimationView
import com.moondroid.bombgame.utils.Extension.visible

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
}