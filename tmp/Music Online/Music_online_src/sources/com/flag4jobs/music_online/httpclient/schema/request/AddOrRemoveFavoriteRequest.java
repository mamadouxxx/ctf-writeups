package com.flag4jobs.music_online.httpclient.schema.request;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class AddOrRemoveFavoriteRequest {

    @SerializedName("music_id")
    private int musicId;

    public int getMusicId() {
        return this.musicId;
    }

    public void setMusicId(int i) {
        this.musicId = i;
    }
}
