package com.moondroid.bombgame.presentation.dialog;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lcom/moondroid/bombgame/presentation/dialog/ExitDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "eventListener", "Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$EventListener;", "type", "Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$Type;", "(Landroid/content/Context;Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$EventListener;Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$Type;)V", "binding", "Lcom/moondroid/bombgame/databinding/DialogExitBinding;", "getEventListener", "()Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$EventListener;", "setEventListener", "(Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$EventListener;)V", "getType", "()Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$Type;", "setType", "(Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$Type;)V", "cancel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "EventListener", "Type", "app_release"})
public final class ExitDialog extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull
    private com.moondroid.bombgame.presentation.dialog.ExitDialog.EventListener eventListener;
    @org.jetbrains.annotations.NotNull
    private com.moondroid.bombgame.presentation.dialog.ExitDialog.Type type;
    private com.moondroid.bombgame.databinding.DialogExitBinding binding;
    
    public ExitDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.presentation.dialog.ExitDialog.EventListener eventListener, @org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.presentation.dialog.ExitDialog.Type type) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.moondroid.bombgame.presentation.dialog.ExitDialog.EventListener getEventListener() {
        return null;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.presentation.dialog.ExitDialog.EventListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.moondroid.bombgame.presentation.dialog.ExitDialog.Type getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.presentation.dialog.ExitDialog.Type p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void cancel() {
    }
    
    @java.lang.Override
    public void show() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$EventListener;", "", "onCancel", "", "onResume", "onRetry", "app_release"})
    public static abstract interface EventListener {
        
        public abstract void onCancel();
        
        public abstract void onResume();
        
        public abstract void onRetry();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/moondroid/bombgame/presentation/dialog/ExitDialog$Type;", "", "(Ljava/lang/String;I)V", "RESUME", "RETRY", "app_release"})
    public static enum Type {
        /*public static final*/ RESUME /* = new RESUME() */,
        /*public static final*/ RETRY /* = new RETRY() */;
        
        Type() {
        }
    }
}