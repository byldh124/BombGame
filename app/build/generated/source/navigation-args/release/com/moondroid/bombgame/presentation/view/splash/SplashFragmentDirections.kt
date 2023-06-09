package com.moondroid.bombgame.presentation.view.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.moondroid.bombgame.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun toHome(): NavDirections = ActionOnlyNavDirections(R.id.toHome)

    public fun toSetting(): NavDirections = ActionOnlyNavDirections(R.id.toSetting)

    public fun toTutorial(): NavDirections = ActionOnlyNavDirections(R.id.toTutorial)
  }
}
