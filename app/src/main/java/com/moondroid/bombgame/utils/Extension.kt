package com.moondroid.bombgame.utils

import android.animation.Animator
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.moondroid.bombgame.utils.firebase.FBCrash

object Extension {
    fun View.visible(boolean: Boolean = true) {
        visibility = if (boolean) View.VISIBLE else View.GONE
    }

    fun Any.debug(msg: String) {
        Log.e("Moondroid", "[${this.javaClass.simpleName.trim()}] | $msg")
    }

    fun Throwable.logException() {
        Log.e("logException", this.stackTraceToString())
        FBCrash.logException(this)
    }

    fun String.shuffle(): String {
        val list = this.toByteArray()
        list.shuffle()
        return String(list)
    }

    @SuppressLint("DiscouragedApi")
    fun Context.getDrawableId(name: String): Int {
        return try {
            resources.getIdentifier(name, "drawable", packageName)
        } catch (e: Exception) {
            0
        }
    }

    fun TextView.afterTextChanged(afterTextChanged: (String) -> Unit) {
        this.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editable: Editable?) {
                afterTextChanged.invoke(editable.toString())
            }
        })
    }

    fun LottieAnimationView.afterAnimation(onFinish :() -> Unit) {
        this.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator) {

            }

            override fun onAnimationEnd(animation: Animator) {
                onFinish.invoke()
            }

            override fun onAnimationCancel(animation: Animator) {
            }

            override fun onAnimationRepeat(animation: Animator) {
            }
        })
    }

    fun Context.toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun Activity.exitApp() {
        this.moveTaskToBack(true)
        this.finish()
        android.os.Process.killProcess(android.os.Process.myPid())
    }


    /**
     * Convert Dp -> Px
     */
    fun dpToPixel(context: Context, dp: Int): Int {
        var pixel = 0.0f
        try {
            pixel = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp.toFloat(),
                context.resources.displayMetrics
            )
        } catch (ignore: Exception) {

        }

        return pixel.toInt()
    }
}