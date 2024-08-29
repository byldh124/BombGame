package com.moondroid.bombgame.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\fH\u0002J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\fJ\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/moondroid/bombgame/utils/Preferences;", "", "()V", "PREF_NAME", "", "preferences", "Landroid/content/SharedPreferences;", "getBoolean", "", "key", "defVal", "getCharacter", "", "getGame", "type", "Lcom/moondroid/bombgame/utils/Constants$GameType;", "getInt", "getString", "init", "", "context", "Landroid/content/Context;", "putBoolean", "value", "putInt", "putString", "requestReview", "setCharacter", "index", "setGame", "boolean", "setReview", "Key", "app_debug"})
public final class Preferences {
    private static android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREF_NAME = "moondroid_bomb_game";
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.utils.Preferences INSTANCE = null;
    
    private Preferences() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final java.lang.String getString(java.lang.String key, java.lang.String defVal) {
        return null;
    }
    
    private final void putString(java.lang.String key, java.lang.String value) {
    }
    
    private final boolean getBoolean(java.lang.String key, boolean defVal) {
        return false;
    }
    
    private final void putBoolean(java.lang.String key, boolean value) {
    }
    
    private final int getInt(java.lang.String key, int defVal) {
        return 0;
    }
    
    private final void putInt(java.lang.String key, int value) {
    }
    
    public final int getCharacter() {
        return 0;
    }
    
    public final void setCharacter(int index) {
    }
    
    public final boolean getGame(@org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.utils.Constants.GameType type) {
        return false;
    }
    
    public final void setGame(@org.jetbrains.annotations.NotNull
    com.moondroid.bombgame.utils.Constants.GameType type, boolean p1_32355860) {
    }
    
    public final boolean requestReview() {
        return false;
    }
    
    public final void setReview() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/moondroid/bombgame/utils/Preferences$Key;", "", "()V", "CHARACTER", "", "INSTALL_DATE", "REVIEW", "getGameKey", "type", "Lcom/moondroid/bombgame/utils/Constants$GameType;", "app_debug"})
    public static final class Key {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String CHARACTER = "KEY_CHARACTER";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String INSTALL_DATE = "INSTALL_DATE";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String REVIEW = "REVIEW";
        @org.jetbrains.annotations.NotNull
        public static final com.moondroid.bombgame.utils.Preferences.Key INSTANCE = null;
        
        private Key() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getGameKey(@org.jetbrains.annotations.NotNull
        com.moondroid.bombgame.utils.Constants.GameType type) {
            return null;
        }
    }
}