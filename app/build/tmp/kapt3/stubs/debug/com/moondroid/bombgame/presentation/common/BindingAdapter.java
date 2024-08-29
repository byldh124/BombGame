package com.moondroid.bombgame.presentation.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0014\u0010\f\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0014\u0010\r\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/moondroid/bombgame/presentation/common/BindingAdapter;", "", "()V", "playAnim", "", "Lcom/airbnb/lottie/LottieAnimationView;", "anim", "", "setTypeDescription", "Landroid/widget/TextView;", "gameType", "Lcom/moondroid/bombgame/utils/Constants$GameType;", "setTypeQuiz", "setTypeTitle", "setVisible", "Landroid/view/View;", "isVisible", "app_debug"})
public final class BindingAdapter {
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.presentation.common.BindingAdapter INSTANCE = null;
    
    private BindingAdapter() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"visible"})
    @kotlin.jvm.JvmStatic
    public static final void setVisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$setVisible, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"playAnim"})
    @kotlin.jvm.JvmStatic
    public static final void playAnim(@org.jetbrains.annotations.NotNull
    com.airbnb.lottie.LottieAnimationView $this$playAnim, boolean anim) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"title"})
    @kotlin.jvm.JvmStatic
    public static final void setTypeTitle(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setTypeTitle, @org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.utils.Constants.GameType gameType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"description"})
    @kotlin.jvm.JvmStatic
    public static final void setTypeDescription(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setTypeDescription, @org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.utils.Constants.GameType gameType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"quiz"})
    @kotlin.jvm.JvmStatic
    public static final void setTypeQuiz(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setTypeQuiz, @org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.utils.Constants.GameType gameType) {
    }
}