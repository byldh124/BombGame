package com.moondroid.bombgame.presentation.view;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/moondroid/bombgame/presentation/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "onBack", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestReview", "showAd", "onFinished", "Lkotlin/Function0;", "vibrate", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private static final long[] VIBRATE_PATTERN = {0L, 1500L, 1000L, 1500L, 1000L, 1500L};
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.presentation.view.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 기기 백 버튼 눌렀을 때 호출
     */
    public final void onBack() {
    }
    
    private final androidx.fragment.app.Fragment getCurrentFragment() {
        return null;
    }
    
    public final void vibrate() {
    }
    
    public final void showAd(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
    
    public final void requestReview() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moondroid/bombgame/presentation/view/MainActivity$Companion;", "", "()V", "VIBRATE_PATTERN", "", "getVIBRATE_PATTERN", "()[J", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final long[] getVIBRATE_PATTERN() {
            return null;
        }
    }
}