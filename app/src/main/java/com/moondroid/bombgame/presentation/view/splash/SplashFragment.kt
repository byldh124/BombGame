package com.moondroid.bombgame.presentation.view.splash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moondroid.bombgame.BuildConfig
import com.moondroid.bombgame.R
import com.moondroid.bombgame.data.model.BaseResponse
import com.moondroid.bombgame.databinding.FragmentSplashBinding
import com.moondroid.bombgame.network.MyRetrofit
import com.moondroid.bombgame.network.RetrofitExService
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.common.viewBinding
import com.moondroid.bombgame.utils.Constants
import com.moondroid.bombgame.utils.Extension.debug
import com.moondroid.bombgame.utils.Extension.exitApp
import com.moondroid.bombgame.utils.Extension.logException
import com.moondroid.bombgame.utils.Extension.toast
import com.moondroid.bombgame.utils.Extension.visible
import com.moondroid.bombgame.utils.Preferences
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashFragment : BaseFragment(R.layout.fragment_splash) {
    private val binding by viewBinding(FragmentSplashBinding::bind)
    private var versionCheck = false
    private val fadeIn: Animation by lazy {
        AnimationUtils.loadAnimation(mContext, R.anim.fade_in).apply {
            setAnimationListener(object : AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                }

                override fun onAnimationEnd(animation: Animation?) {
                    binding.isReady = true
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }

            })
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (versionCheck) {
            binding.logo.startAnimation(fadeIn)
        } else {
            binding.isReady = true
            checkAppVersion()
        }
        initView()
    }

    private fun checkAppVersion() {
        val service = MyRetrofit.retrofit.create(RetrofitExService::class.java)
        service.checkAppVersion(
            BuildConfig.VERSION_CODE,
            BuildConfig.VERSION_NAME,
            mContext.packageName
        ).enqueue(object : Callback<BaseResponse> {
            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        when (it.code) {
                            Constants.ResponseCode.INACTIVE -> {
                                update()
                            }

                            Constants.ResponseCode.NOT_EXIST -> {
                                notExist()
                            }
                        }
                    }
                }
            }

            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                t.logException()
            }
        })
    }

    private fun update() {
        showMessage(getString(R.string.description_plz_update)) {
            try {
                val updateIntent = Intent(Intent.ACTION_VIEW)
                updateIntent.data = Uri.parse("market://details?id=${mContext.packageName}")
                startActivity(updateIntent)
            } catch (e: Exception) {
                e.logException()
            }
        }
    }

    private fun notExist() {
        showMessage("${getString(R.string.description_version_not_exist)}\nv${BuildConfig.VERSION_NAME}(${BuildConfig.VERSION_CODE})") {
            mContext.exitApp()
        }
    }

    private fun initView() {
        binding.btnStart.setOnClickListener {
            findNavController().navigate(SplashFragmentDirections.toHome())
        }

        binding.btnSetting.setOnClickListener {
            findNavController().navigate(SplashFragmentDirections.toSetting())
        }

        binding.btnHowToUse.setOnClickListener {
            findNavController().navigate(SplashFragmentDirections.toTutorial())
        }

        if (Preferences.requestReview()) mContext.requestReview()
    }

    private var mBackWait = 0L

    override fun onBack() {
        try {
            if (System.currentTimeMillis() - mBackWait >= 2000) {
                mBackWait = System.currentTimeMillis()
                mContext.toast(getString(R.string.description_press_back_once_more))
            } else {
                mContext.exitApp()
            }
        } catch (e: Exception) {
            e.logException()
        }
    }
}