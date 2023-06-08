package com.moondroid.bombgame.presentation.common

import android.view.View
import androidx.databinding.BindingAdapter
import com.moondroid.bombgame.utils.Extension.visible

object BindingAdapter {
    @BindingAdapter("visible")
    @JvmStatic
    fun View.setVisible(isVisible: Boolean) {
        visible(isVisible)
    }
}