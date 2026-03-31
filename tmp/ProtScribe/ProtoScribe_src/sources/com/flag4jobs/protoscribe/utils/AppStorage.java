package com.flag4jobs.protoscribe.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class AppStorage {
    private static final String KEY_USER_UUID = "user_uuid";
    private static final String STORAGE_NAME = "AppStorage";

    public static void setUserUuid(Context context, String str) {
        context.getSharedPreferences(STORAGE_NAME, 0).edit().putString(KEY_USER_UUID, str).apply();
    }

    public static String getUserUuid(Context context) {
        return context.getSharedPreferences(STORAGE_NAME, 0).getString(KEY_USER_UUID, null);
    }
}
