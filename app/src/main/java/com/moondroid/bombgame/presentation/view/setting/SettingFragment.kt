package com.moondroid.bombgame.presentation.view.setting

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.moondroid.bombgame.R.layout.fragment_setting
import com.moondroid.bombgame.databinding.FragmentSettingBinding
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding
import com.moondroid.bombgame.utils.Extension.toast
import com.moondroid.bombgame.utils.Preferences

class SettingFragment : BaseFragment(fragment_setting) {
    private val binding by viewBinding(FragmentSettingBinding::bind)
    private val viewModel: SettingViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.model = viewModel

        viewModel.game01.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame01(it)
            } else {
                viewModel.game01.value = true
            }
        }

        viewModel.game02.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame02(it)
            } else {
                viewModel.game02.value = true
            }
        }

        viewModel.game03.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame03(it)
            } else {
                viewModel.game03.value = true
            }
        }
    }
    private fun checkValue(): Boolean {
        val boolean =  viewModel.game01.value == true || viewModel.game02.value == true || viewModel.game03.value == true
        return if (boolean) {
            true
        } else {
            mContext.toast("게임을 하나 이상 선택하셔야 합니다.")
            false
        }
    }
}