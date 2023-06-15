package com.moondroid.bombgame.presentation.view.setting

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.moondroid.bombgame.R
import com.moondroid.bombgame.R.layout.fragment_setting
import com.moondroid.bombgame.databinding.FragmentSettingBinding
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding
import com.moondroid.bombgame.utils.Constants
import com.moondroid.bombgame.utils.Extension.toast
import com.moondroid.bombgame.utils.Preferences

class SettingFragment : BaseFragment(fragment_setting) {
    private val binding by viewBinding(FragmentSettingBinding::bind)
    private val viewModel: SettingViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.model = viewModel

        binding.icBack.setOnClickListener {
            findNavController().popBackStack()
        }

        viewModel.initial.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame(Constants.GameType.Initial, it)
            } else {
                viewModel.initial.value = true
            }
        }

        viewModel.association.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame(Constants.GameType.Association, it)
            } else {
                viewModel.association.value = true
            }
        }

        viewModel.question.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame(Constants.GameType.Question, it)
            } else {
                viewModel.question.value = true
            }
        }

        viewModel.lastWord.observe(viewLifecycleOwner) {
            if (checkValue()) {
                Preferences.setGame(Constants.GameType.LastWord, it)
            } else {
                viewModel.lastWord.value = true
            }
        }
    }

    private fun checkValue(): Boolean {
        val boolean =
            viewModel.initial.value == true || viewModel.association.value == true || viewModel.question.value == true || viewModel.lastWord.value == true

        return if (boolean) {
            true
        } else {
            mContext.toast(getString(R.string.desc_select_more_one_game))
            false
        }
    }
}