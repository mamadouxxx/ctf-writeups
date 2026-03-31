package com.flag4jobs.carzz.internal;

/* JADX INFO: loaded from: classes.dex */
public class LeaderboardUser {
    private boolean isSelf;
    private String phoneNumber;
    private int score;

    public LeaderboardUser(String str, int i, boolean z) {
        this.phoneNumber = str;
        this.score = i;
        this.isSelf = z;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public boolean isSelf() {
        return this.isSelf;
    }

    public void setSelf(boolean z) {
        this.isSelf = z;
    }
}
