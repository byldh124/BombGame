package com.moondroid.bombgame.presentation.view.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.moondroid.bombgame.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun toSplash(): NavDirections = ActionOnlyNavDirections(R.id.toSplash)
  }
}
