package com.flag4jobs.carzz.internal;

/* JADX INFO: loaded from: classes.dex */
public class Contact {
    private boolean isFriend;
    private String phoneNumber;

    public Contact(String str, boolean z) {
        this.phoneNumber = str;
        this.isFriend = z;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public boolean isFriend() {
        return this.isFriend;
    }

    public void setFriend(boolean z) {
        this.isFriend = z;
    }
}
