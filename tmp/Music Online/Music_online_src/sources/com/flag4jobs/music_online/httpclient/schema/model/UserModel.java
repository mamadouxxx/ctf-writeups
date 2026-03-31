package com.flag4jobs.music_online.httpclient.schema.model;

/* JADX INFO: loaded from: classes.dex */
public class UserModel {
    private String email;
    private int id;
    private String passwordHash;
    private String username;

    public UserModel(int i, String str, String str2, String str3) {
        this.id = i;
        this.username = str;
        this.email = str2;
        this.passwordHash = str3;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String str) {
        this.passwordHash = str;
    }
}
