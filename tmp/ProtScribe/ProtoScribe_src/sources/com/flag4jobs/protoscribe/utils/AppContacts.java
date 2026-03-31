package com.flag4jobs.protoscribe.utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AppContacts {
    public static final String TAG = "AppContacts";

    private static void obtainReadContactsPermission(Context context) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
            ActivityCompat.requestPermissions((AppCompatActivity) context, new String[]{"android.permission.READ_CONTACTS"}, 1);
        }
    }

    public static ArrayList<String> getAllPhoneNumbers(Context context) {
        obtainReadContactsPermission(context);
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("data1")));
        }
        cursorQuery.close();
        return arrayList;
    }
}
