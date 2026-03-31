package com.flag4jobs.carzz.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class NetClient {
    private static final String TAG = "NetClient";
    private NetHTTPClient netHTTP = new NetHTTPClient();
    private String session = null;
    private URL url;

    public NetClient(URL url) {
        this.url = url;
    }

    public NetClient(Context context) {
        loadUrl(context);
        loadSession(context);
    }

    public String getSession() {
        return this.session;
    }

    public static String getUrl(Context context) {
        return context.getSharedPreferences("Carzz", 0).getString("url", null);
    }

    public void setUrl(Context context, URL url) {
        this.url = url;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("Carzz", 0).edit();
        editorEdit.putString("url", this.url.toString());
        editorEdit.apply();
    }

    public void loadUrl(Context context) {
        try {
            this.url = new URL(getUrl(context));
        } catch (MalformedURLException e) {
            Log.e(TAG, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void setSession(Context context, String str) {
        this.session = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("Carzz", 0).edit();
        editorEdit.putString("session", str);
        editorEdit.apply();
    }

    public void loadSession(Context context) {
        this.session = context.getSharedPreferences("Carzz", 0).getString("session", null);
    }

    public NetHTTPResponse ping() {
        return this.netHTTP.send(this.url, this.session, NetAction.PING, new ArrayList<>());
    }

    public NetHTTPResponse login(String str, String str2) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(str.getBytes(StandardCharsets.UTF_8));
        arrayList.add(str2.getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.LOGIN, arrayList);
    }

    public NetHTTPResponse register(String str, String str2) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(str.getBytes(StandardCharsets.UTF_8));
        arrayList.add(str2.getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.REGISTER, arrayList);
    }

    public NetHTTPResponse playQuiz(long j) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(String.valueOf(j).getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.PLAY_QUIZ, arrayList);
    }

    public NetHTTPResponse submitQuiz(int i, ArrayList<String> arrayList) {
        ArrayList<byte[]> arrayList2 = new ArrayList<>();
        arrayList2.add(String.valueOf(i).getBytes(StandardCharsets.UTF_8));
        arrayList2.add(String.valueOf(arrayList.size()).getBytes(StandardCharsets.UTF_8));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(it.next()).getBytes(StandardCharsets.UTF_8));
        }
        return this.netHTTP.send(this.url, this.session, NetAction.SUBMIT_QUIZ, arrayList2);
    }

    public NetHTTPResponse getFriends() {
        return this.netHTTP.send(this.url, this.session, NetAction.LIST_FRIENDS, new ArrayList<>());
    }

    public NetHTTPResponse addFriend(String str) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(str.getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.ADD_FRIEND, arrayList);
    }

    public NetHTTPResponse removeFriend(String str) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(str.getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.REMOVE_FRIEND, arrayList);
    }

    public NetHTTPResponse quizLeaderboard(int i) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(String.valueOf(i).getBytes(StandardCharsets.UTF_8));
        return this.netHTTP.send(this.url, this.session, NetAction.QUIZ_LEADERBOARD, arrayList);
    }

    public NetHTTPResponse totalScore() {
        return this.netHTTP.send(this.url, this.session, NetAction.TOTAL_SCORE, new ArrayList<>());
    }
}
