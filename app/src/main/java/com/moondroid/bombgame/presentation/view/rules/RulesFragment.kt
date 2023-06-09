package com.moondroid.bombgame.presentation.view.rules

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.moondroid.bombgame.R.layout.fragment_rules
import com.moondroid.bombgame.databinding.FragmentRulesBinding
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding

class RulesFragment: BaseFragment(fragment_rules) {
    private val binding by viewBinding(FragmentRulesBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.icBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}