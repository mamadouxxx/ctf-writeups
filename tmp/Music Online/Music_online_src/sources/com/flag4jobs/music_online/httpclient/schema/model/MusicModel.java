package com.flag4jobs.music_online.httpclient.schema.model;

/* JADX INFO: loaded from: classes.dex */
public class MusicModel {
    private String artist;
    private int duration;
    private String genre;
    private int id;
    private boolean isFavorite;
    private String title;

    public MusicModel(boolean z, int i, String str, String str2, String str3, int i2) {
        this.isFavorite = z;
        this.duration = i;
        this.genre = str;
        this.artist = str2;
        this.title = str3;
        this.id = i2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String str) {
        this.genre = str;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public boolean isFavorite() {
        return this.isFavorite;
    }

    public void setFavorite(boolean z) {
        this.isFavorite = z;
    }
}
