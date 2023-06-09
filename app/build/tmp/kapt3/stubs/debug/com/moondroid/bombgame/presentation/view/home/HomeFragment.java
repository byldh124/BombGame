package com.moondroid.bombgame.presentation.view.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u001a\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/moondroid/bombgame/presentation/view/home/HomeFragment;", "Lcom/moondroid/bombgame/presentation/base/BaseFragment;", "()V", "binding", "Lcom/moondroid/bombgame/databinding/FragmentHomeBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/moondroid/bombgame/databinding/FragmentHomeBinding;", "binding$delegate", "Lcom/moondroid/bombgame/presentation/common/FragmentViewBindingDelegate;", "boomSound", "Landroid/media/MediaPlayer;", "clockSound", "exitDialog", "Lcom/moondroid/bombgame/presentation/dialog/ExitDialog;", "getExitDialog", "()Lcom/moondroid/bombgame/presentation/dialog/ExitDialog;", "exitDialog$delegate", "Lkotlin/Lazy;", "gameType", "Ljava/util/ArrayList;", "", "isPause", "", "randomTime", "time", "timer", "Ljava/util/TimerTask;", "getExecutor", "Ljava/util/concurrent/Executor;", "getTime", "init", "", "onBack", "onDestroy", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setGame", "startAnim", "GameStatus", "app_debug"})
public final class HomeFragment extends com.moondroid.bombgame.presentation.base.BaseFragment {
    @org.jetbrains.annotations.NotNull
    private final com.moondroid.bombgame.presentation.common.FragmentViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.Nullable
    private java.util.TimerTask timer;
    private int time = 0;
    private int randomTime = 0;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer clockSound;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer boomSound;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> gameType = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy exitDialog$delegate = null;
    private boolean isPause = false;
    
    public HomeFragment() {
        super(0);
    }
    
    private final com.moondroid.bombgame.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.moondroid.bombgame.presentation.dialog.ExitDialog getExitDialog() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setGame() {
    }
    
    private final void startAnim() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onBack() {
    }
    
    private final int getTime() {
        return 0;
    }
    
    private final java.util.concurrent.Executor getExecutor() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/moondroid/bombgame/presentation/view/home/HomeFragment$GameStatus;", "", "(Ljava/lang/String;I)V", "COUNT", "BOMB", "EXPLOSION", "app_debug"})
    public static enum GameStatus {
        /*public static final*/ COUNT /* = new COUNT() */,
        /*public static final*/ BOMB /* = new BOMB() */,
        /*public static final*/ EXPLOSION /* = new EXPLOSION() */;
        
        GameStatus() {
        }
    }
}