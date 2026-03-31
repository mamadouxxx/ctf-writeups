package com.flag4jobs.carzz.net;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NetHTTPResponse {
    private static final String TAG = "NetHTTPResponse";
    HashMap<String, String> headers;
    JSONObject responseBody;
    int statusCode;

    NetHTTPResponse(int i, HashMap<String, String> map, JSONObject jSONObject) {
        this.statusCode = i;
        this.headers = map;
        this.responseBody = jSONObject;
    }

    public boolean isOk() {
        try {
            if (this.statusCode == 200) {
                return this.responseBody.getBoolean("success");
            }
            return false;
        } catch (JSONException e) {
            Log.e(TAG, "Error in isOk(): " + e.getMessage());
            return false;
        }
    }

    public String getMessage() {
        try {
            return this.responseBody.getString("message");
        } catch (JSONException e) {
            Log.e(TAG, "Error in getMessage(): " + e.getMessage());
            return null;
        }
    }

    public JSONObject getDataObject() {
        try {
            return this.responseBody.getJSONObject("data");
        } catch (JSONException e) {
            Log.e(TAG, "Error in getData(): " + e.getMessage());
            return null;
        }
    }

    public JSONArray getDataArray() {
        try {
            return this.responseBody.getJSONArray("data");
        } catch (JSONException e) {
            Log.e(TAG, "Error in getData(): " + e.getMessage());
            return null;
        }
    }
}
