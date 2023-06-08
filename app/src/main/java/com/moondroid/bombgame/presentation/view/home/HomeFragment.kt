package com.moondroid.bombgame.presentation.view.home

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.moondroid.bombgame.R
import com.moondroid.bombgame.databinding.FragmentHomeBinding
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding
import com.moondroid.bombgame.presentation.dialog.ExitDialog
import com.moondroid.bombgame.utils.Extension.afterAnimation
import com.moondroid.bombgame.utils.Extension.debug
import com.moondroid.bombgame.utils.Extension.logException
import com.moondroid.bombgame.utils.Preferences
import java.util.Timer
import java.util.TimerTask
import java.util.concurrent.Executor
import kotlin.random.Random

class HomeFragment : BaseFragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private var timer: TimerTask? = null
    private var time = 0
    private var randomTime = 0

    private var clockSound: MediaPlayer? = null
    private var boomSound: MediaPlayer? = null

    private val exitDialog: ExitDialog by lazy {
        ExitDialog(mContext, object : ExitDialog.EventListener {
            override fun onCancel() {
                findNavController().navigate(HomeFragmentDirections.toSplash())
            }

            override fun onResume() {
                isPause = false
            }

            override fun onRetry() {
                initView()
            }
        })
    }

    private var isPause = false

    enum class GameStatus {
        COUNT, BOMB, EXPLOSION
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clockSound = MediaPlayer.create(mContext, R.raw.clock).apply {
            isLooping = true
        }
        boomSound = MediaPlayer.create(mContext, R.raw.boom)

        // 배너 광고 초기화
        MobileAds.initialize(mContext)
        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)

        val rawId = when (Preferences.getCharacter()) {
            2 -> R.raw.bomb02
            3 -> R.raw.bomb03
            else -> R.raw.bomb01
        }
        binding.lottieBomb.setAnimation(rawId)

        binding.lottieCountDown.afterAnimation {
            startAnim()
        }

        binding.lottieExplosion.afterAnimation {
            if (!exitDialog.isShowing) {
                exitDialog.type = ExitDialog.Type.RETRY
                exitDialog.show()
            }
        }

        initView()
    }

    private fun initView() {
        time = 0
        binding.status = GameStatus.COUNT
        binding.lottieCountDown.playAnimation()
    }

    private fun startAnim() {
        binding.status = GameStatus.BOMB
        clockSound?.start()
        binding.lottieBomb.playAnimation()

        randomTime = Random.nextInt(5, 10)
        timer = object : TimerTask() {
            override fun run() {
                try {
                    if (!isPause) {
                        time++
                        getExecutor().execute {
                            binding.tvTimer.text =
                                String.format("%02d : %02d", time / 60, time % 60)
                        }
                        if (time == randomTime) {
                            timer?.cancel()
                            getExecutor().execute {
                                binding.status = GameStatus.EXPLOSION
                                clockSound?.pause()
                                boomSound?.start()
                                binding.lottieExplosion.playAnimation()
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.logException()
                }
            }
        }
        val timer2 = Timer()
        timer2.scheduleAtFixedRate(this.timer, 0, 1000)
    }

    override fun onStop() {
        super.onStop()
        findNavController().popBackStack()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer?.let {
            it.cancel()
            timer = null
        }
    }

    override fun onBack() {
        if (binding.status == GameStatus.EXPLOSION) {
            debug("Explosion")
            exitDialog.type = ExitDialog.Type.RETRY
        } else {
            exitDialog.type = ExitDialog.Type.RESUME
            isPause = true
        }
        exitDialog.show()
    }

    private fun getExecutor(): Executor = ContextCompat.getMainExecutor(mContext)
}