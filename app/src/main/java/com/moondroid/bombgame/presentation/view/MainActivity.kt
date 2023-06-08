package com.moondroid.bombgame.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.moondroid.bombgame.R
import com.moondroid.bombgame.presentation.base.BaseFragment
import com.moondroid.bombgame.presentation.view.home.HomeFragment
import com.moondroid.bombgame.presentation.view.splash.SplashFragment
import com.moondroid.bombgame.utils.Extension.logException

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
}