package com.moondroid.bombgame.network;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/moondroid/bombgame/network/RetrofitExService;", "", "checkAppVersion", "Lretrofit2/Call;", "Lcom/moondroid/bombgame/data/model/BaseResponse;", "versionCode", "", "versionName", "", "packageName", "app_debug"})
public abstract interface RetrofitExService {
    
    @retrofit2.http.GET(value = "app/checkVersion.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.moondroid.bombgame.data.model.BaseResponse> checkAppVersion(@retrofit2.http.Query(value = "versionCode")
    int versionCode, @retrofit2.http.Query(value = "versionName")
    @org.jetbrains.annotations.NotNull
    java.lang.String versionName, @retrofit2.http.Query(value = "packageName")
    @org.jetbrains.annotations.NotNull
    java.lang.String packageName);
}