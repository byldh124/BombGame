package com.moondroid.bombgame.utils.firebase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/moondroid/bombgame/utils/firebase/FBAnalyze;", "", "()V", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "init", "", "context", "Landroid/content/Context;", "logEvent", "event", "", "params", "Landroid/os/Bundle;", "app_release"})
public final class FBAnalyze {
    private static com.google.firebase.analytics.FirebaseAnalytics analytics;
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.utils.firebase.FBAnalyze INSTANCE = null;
    
    private FBAnalyze() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void logEvent(@org.jetbrains.annotations.NotNull
    java.lang.String event) {
    }
    
    public final void logEvent(@org.jetbrains.annotations.NotNull
    java.lang.String event, @org.jetbrains.annotations.NotNull
    android.os.Bundle params) {
    }
}