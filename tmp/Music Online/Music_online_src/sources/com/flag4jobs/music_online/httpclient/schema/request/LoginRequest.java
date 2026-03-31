package com.flag4jobs.music_online.httpclient.schema.request;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class LoginRequest {

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private String email;

    @SerializedName("password")
    private String password;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
