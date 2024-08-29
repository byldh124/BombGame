package com.moondroid.bombgame.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0012\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fJ\u001e\u0010\u0010\u001a\u00020\f*\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u0012J\u0012\u0010\u0013\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\tJ\n\u0010\u0015\u001a\u00020\f*\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0007J\n\u0010\u0019\u001a\u00020\f*\u00020\u001aJ\n\u0010\u001b\u001a\u00020\t*\u00020\tJ\u0012\u0010\u001c\u001a\u00020\f*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\tJ\u0014\u0010\u001e\u001a\u00020\f*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!\u00a8\u0006\""}, d2 = {"Lcom/moondroid/bombgame/utils/Extension;", "", "()V", "dpToPixel", "", "context", "Landroid/content/Context;", "dp", "getToday", "", "pattern", "afterAnimation", "", "Lcom/airbnb/lottie/LottieAnimationView;", "onFinish", "Lkotlin/Function0;", "afterTextChanged", "Landroid/widget/TextView;", "Lkotlin/Function1;", "debug", "msg", "exitApp", "Landroid/app/Activity;", "getDrawableId", "name", "logException", "", "shuffle", "toast", "message", "visible", "Landroid/view/View;", "boolean", "", "app_debug"})
public final class Extension {
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.utils.Extension INSTANCE = null;
    
    private Extension() {
        super();
    }
    
    public final void visible(@org.jetbrains.annotations.NotNull
    android.view.View $this$visible, boolean p1_32355860) {
    }
    
    public final void debug(@org.jetbrains.annotations.NotNull
    java.lang.Object $this$debug, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void logException(@org.jetbrains.annotations.NotNull
    java.lang.Throwable $this$logException) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String shuffle(@org.jetbrains.annotations.NotNull
    java.lang.String $this$shuffle) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"DiscouragedApi"})
    public final int getDrawableId(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDrawableId, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return 0;
    }
    
    public final void afterTextChanged(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$afterTextChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> afterTextChanged) {
    }
    
    public final void afterAnimation(@org.jetbrains.annotations.NotNull
    com.airbnb.lottie.LottieAnimationView $this$afterAnimation, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinish) {
    }
    
    public final void toast(@org.jetbrains.annotations.NotNull
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void exitApp(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$exitApp) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToday(@org.jetbrains.annotations.NotNull
    java.lang.String pattern) {
        return null;
    }
    
    /**
     * Convert Dp -> Px
     */
    public final int dpToPixel(@org.jetbrains.annotations.NotNull
    android.content.Context context, int dp) {
        return 0;
    }
}