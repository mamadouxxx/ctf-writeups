package com.flag4jobs.carzz.net;

/* JADX INFO: loaded from: classes.dex */
public enum NetAction {
    PING(0),
    LOGIN(1),
    REGISTER(2),
    PLAY_QUIZ(3),
    SUBMIT_QUIZ(4),
    LIST_FRIENDS(5),
    ADD_FRIEND(6),
    REMOVE_FRIEND(7),
    QUIZ_LEADERBOARD(8),
    TOTAL_SCORE(9);

    private final int id;

    NetAction(int i) {
        this.id = i;
    }

    public int getID() {
        return this.id;
    }
}
