package com.flag4jobs.music_online.storage;

import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import com.flag4jobs.music_online.httpclient.ApiClient;

/* JADX INFO: loaded from: classes.dex */
public class JWTStorage {
    private static final String KEY_TOKEN = "token";
    private static final String SHARED_PREFS = "AuthPrefs";

    public static String getJWT(AppCompatActivity appCompatActivity) {
        return appCompatActivity.getSharedPreferences(SHARED_PREFS, 0).getString(KEY_TOKEN, null);
    }

    public static void saveJWT(AppCompatActivity appCompatActivity, String str) {
        SharedPreferences.Editor editorEdit = appCompatActivity.getSharedPreferences(SHARED_PREFS, 0).edit();
        editorEdit.putString(KEY_TOKEN, str);
        editorEdit.apply();
        ApiClient.setJWT(str);
    }

    public static void clearJWT(AppCompatActivity appCompatActivity) {
        SharedPreferences.Editor editorEdit = appCompatActivity.getSharedPreferences(SHARED_PREFS, 0).edit();
        editorEdit.remove(KEY_TOKEN);
        editorEdit.apply();
        ApiClient.setJWT(null);
    }
}
