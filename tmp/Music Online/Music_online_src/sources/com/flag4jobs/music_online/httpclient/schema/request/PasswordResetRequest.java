package com.flag4jobs.music_online.httpclient.schema.request;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class PasswordResetRequest {

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }
}
