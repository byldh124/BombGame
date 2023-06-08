package com.moondroid.bombgame.presentation.base

import android.content.Context
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.moondroid.bombgame.presentation.dialog.OneButtonDialog
import com.moondroid.bombgame.presentation.view.MainActivity

open class BaseFragment(@LayoutRes layout: Int): Fragment(layout) {
    protected lateinit var mContext: MainActivity

    private var oneButtonDialog: OneButtonDialog? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context as MainActivity
    }

    protected fun showMessage(msg: String, onClick :() -> Unit = {}) {
        oneButtonDialog?.let {
            it.msg = msg
            it.onClick = onClick
        } ?: run {
            oneButtonDialog = OneButtonDialog(mContext, msg, onClick)
        }
        oneButtonDialog?.show()
    }

    open fun onBack() {
        findNavController().popBackStack()
    }


}