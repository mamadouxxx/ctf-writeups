package com.flag4jobs.carzz.internal;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateManager {
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    public static int getTodayTimestamp() {
        Calendar calendar = Calendar.getInstance(UTC);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 1000);
    }

    public static int getTimestampFromToday(int i) {
        Calendar calendar = Calendar.getInstance(UTC);
        calendar.add(5, i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 1000);
    }

    public static String getTodayDate() {
        Calendar calendar = Calendar.getInstance(UTC);
        return calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
    }

    public static String getDateFromToday(int i) {
        Calendar calendar = Calendar.getInstance(UTC);
        calendar.add(5, i);
        return calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
    }
}
