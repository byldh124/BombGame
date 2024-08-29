package com.moondroid.bombgame.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/moondroid/bombgame/utils/Constants;", "", "()V", "GameType", "ResponseCode", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final com.moondroid.bombgame.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moondroid/bombgame/utils/Constants$GameType;", "", "(Ljava/lang/String;I)V", "Initial", "Association", "Question", "LastWord", "app_debug"})
    public static enum GameType {
        /*public static final*/ Initial /* = new Initial() */,
        /*public static final*/ Association /* = new Association() */,
        /*public static final*/ Question /* = new Question() */,
        /*public static final*/ LastWord /* = new LastWord() */;
        
        GameType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/moondroid/bombgame/utils/Constants$ResponseCode;", "", "()V", "ALREADY_EXIST", "", "FAIL", "INACTIVE", "INVALID_VALUE", "NOT_EXIST", "SUCCESS", "app_debug"})
    public static final class ResponseCode {
        public static final int SUCCESS = 1000;
        public static final int FAIL = 2000;
        public static final int NOT_EXIST = 2001;
        public static final int ALREADY_EXIST = 2002;
        public static final int INVALID_VALUE = 2003;
        public static final int INACTIVE = 2004;
        @org.jetbrains.annotations.NotNull
        public static final com.moondroid.bombgame.utils.Constants.ResponseCode INSTANCE = null;
        
        private ResponseCode() {
            super();
        }
    }
}