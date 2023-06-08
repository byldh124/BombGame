package com.moondroid.bombgame.presentation.view.home

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.moondroid.bombgame.R
import com.moondroid.bombgame.databinding.FragmentHomeBinding
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding
import com.moondroid.bombgame.utils.Extension.visible
import java.util.concurrent.Executor

class HomeFragment : BaseFragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private var startTime = 0L
    private var currentLevel = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lottieBomb.setAnimation(R.raw.bomb01)
        binding.lottieBomb.playAnimation()
        startTimer()
    }

    private fun startTimer() {
        Thread {
            var isFinish = false
            while (!isFinish) {
                val now = System.currentTimeMillis() - startTime
                isFinish = now > 10000
            }
            getExecutor().execute{
                binding.lottieBomb.visible(false)
                binding.lottieExplosion.visible()
                binding.lottieExplosion.playAnimation()
            }

        }.apply {
            startTime = System.currentTimeMillis()
            start()
        }
    }

    private fun getExecutor(): Executor = ContextCompat.getMainExecutor(mContext)
}