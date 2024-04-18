package com.moondroid.bombgame.presentation.base;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/moondroid/bombgame/presentation/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "layout", "", "(I)V", "mContext", "Lcom/moondroid/bombgame/presentation/view/MainActivity;", "getMContext", "()Lcom/moondroid/bombgame/presentation/view/MainActivity;", "setMContext", "(Lcom/moondroid/bombgame/presentation/view/MainActivity;)V", "oneButtonDialog", "Lcom/moondroid/bombgame/presentation/dialog/OneButtonDialog;", "onAttach", "", "context", "Landroid/content/Context;", "onBack", "showMessage", "msg", "", "onClick", "Lkotlin/Function0;", "app_release"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    protected com.moondroid.bombgame.presentation.view.MainActivity mContext;
    @org.jetbrains.annotations.Nullable
    private com.moondroid.bombgame.presentation.dialog.OneButtonDialog oneButtonDialog;
    
    public BaseFragment(@androidx.annotation.LayoutRes
    int layout) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.moondroid.bombgame.presentation.view.MainActivity getMContext() {
        return null;
    }
    
    protected final void setMContext(@org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.presentation.view.MainActivity p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    protected final void showMessage(@org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public void onBack() {
    }
}