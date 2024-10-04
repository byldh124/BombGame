package com.moondroid.bombgame.presentation.view

import android.os.Build
import android.os.Bundle
import android.os.CombinedVibration
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.WindowManager
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.play.core.review.ReviewManagerFactory
import com.moondroid.bombgame.R
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.utils.Extension.debug
import com.moondroid.bombgame.utils.Extension.logException
import com.moondroid.bombgame.utils.Preferences

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        this.onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBack()
            }
        })
    }

    /** 기기 백 버튼 눌렀을 때 호출 **/
    fun onBack() {
        try {
            val fragment = getCurrentFragment()
            if (fragment is BaseFragment) fragment.onBack()
        } catch (e: Exception) {
            e.logException()
        }
    }

    private fun getCurrentFragment(): Fragment? {
        return try {
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
            navHostFragment?.childFragmentManager?.fragments?.first()
        } catch (e: Exception) {
            e.logException()
            null
        }
    }

    fun vibrate() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val vibrator = getSystemService(VibratorManager::class.java)
                val vibrationEffect =
                    VibrationEffect.createWaveform(
                        VIBRATE_PATTERN,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                val combinedVibration = CombinedVibration.createParallel(vibrationEffect)
                vibrator.vibrate(combinedVibration)
            } else {
                val vibrator = getSystemService(Vibrator::class.java)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator.vibrate(
                        VibrationEffect.createWaveform(
                            VIBRATE_PATTERN,
                            VibrationEffect.DEFAULT_AMPLITUDE
                        )
                    )
                } else {
                    @Suppress("DEPRECATION")
                    vibrator.vibrate(VIBRATE_PATTERN, -1)
                }
            }
        } catch (e: Exception) {
            e.logException()
        }
    }

    /*fun showAd(onFinished: () -> Unit) {
        try {
            InterstitialAd.load(
                this,
                getString(R.string.foreground_id),
                AdRequest.Builder().build(),
                object : InterstitialAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        debug("AdError: ${adError.message}")
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
                        interstitialAd.fullScreenContentCallback =
                            object : FullScreenContentCallback() {
                                override fun onAdDismissedFullScreenContent() {
                                    super.onAdDismissedFullScreenContent()
                                    onFinished()
                                }
                            }

                        interstitialAd.show(this@MainActivity)
                    }
                })
        } catch (e: Exception) {
            e.logException()
        }
    }*/

    fun requestReview() {
        try {
            Preferences.setReview()
            val manager = ReviewManagerFactory.create(this)
            val request = manager.requestReviewFlow()
            request.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val reviewInfo = task.result
                    manager.launchReviewFlow(this@MainActivity, reviewInfo)

                }
            }
        } catch (e: Exception) {
            e.logException()
        }
    }

    companion object {
        val VIBRATE_PATTERN = longArrayOf(0, 1500, 1000, 1500, 1000, 1500)
    }

}