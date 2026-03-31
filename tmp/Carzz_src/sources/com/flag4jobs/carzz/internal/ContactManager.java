package com.flag4jobs.carzz.internal;

import android.app.Activity;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ContactManager {
    public static ArrayList<String> getAllPhoneNumbers(Activity activity) {
        Cursor cursorQuery;
        boolean zRequestContactsPermission = PermissionHelper.requestContactsPermission(activity);
        ArrayList<String> arrayList = new ArrayList<>();
        if (!zRequestContactsPermission || (cursorQuery = activity.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null)) == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("data1")));
        }
        cursorQuery.close();
        return arrayList;
    }
}
