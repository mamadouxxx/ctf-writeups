package com.flag4jobs.carzz.internal;

import android.app.Activity;
import android.util.Log;
import androidx.core.app.ActivityCompat;

/* JADX INFO: loaded from: classes.dex */
public class PermissionHelper {
    private static final String TAG = "PermissionHelper";

    public static boolean requestNetworkPermission(Activity activity) {
        try {
            if (activity.getPackageManager().checkPermission("android.permission.INTERNET", activity.getPackageName()) != 0) {
                ActivityCompat.requestPermissions(activity, new String[]{"android.permission.INTERNET"}, 1);
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error: " + e.getMessage());
            return false;
        }
    }

    public static boolean requestContactsPermission(Activity activity) {
        try {
            if (activity.getPackageManager().checkPermission("android.permission.READ_CONTACTS", activity.getPackageName()) != 0) {
                ActivityCompat.requestPermissions(activity, new String[]{"android.permission.READ_CONTACTS"}, 1);
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error: " + e.getMessage());
            return false;
        }
    }
}
