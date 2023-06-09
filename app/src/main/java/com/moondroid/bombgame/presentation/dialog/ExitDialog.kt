package com.moondroid.bombgame.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.moondroid.bombgame.R
import com.moondroid.bombgame.databinding.DialogExitBinding

class ExitDialog(context: Context, var eventListener: EventListener,  var type: Type = Type.RETRY ) :
    Dialog(context, R.style.DialogTheme) {
    private lateinit var binding: DialogExitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogExitBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
        binding.btnExit.setOnClickListener {
            cancel()
        }
    }

    override fun cancel() {
        super.cancel()
        eventListener.onCancel()
    }


    override fun show() {
        super.show()
        if (type == Type.RESUME) {
            binding.tvMessage.text = context.getString(R.string.cmn_want_exit)
            binding.btnResume.text = context.getString(R.string.cmn_continue)
            binding.btnResume.setOnClickListener {
                eventListener.onResume()
                super.cancel()
            }
        } else {
            binding.tvMessage.text = context.getString(R.string.cmn_continue_game)
            binding.btnResume.text = context.getString(R.string.cmn_retry)
            binding.btnResume.setOnClickListener {
                eventListener.onRetry()
                super.cancel()
            }
        }
    }

    enum class Type {
        RESUME, RETRY
    }

    interface EventListener {
        fun onCancel()
        fun onResume()
        fun onRetry()
    }
}