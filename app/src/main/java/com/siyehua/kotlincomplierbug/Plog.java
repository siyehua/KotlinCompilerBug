package com.siyehua.kotlincomplierbug;

import android.util.Log;

public class Plog {
    private static boolean logcatSwitch;
    public static void setLogcatSwitch(boolean logcatSwitch) {
        Plog.logcatSwitch = logcatSwitch;
        Log.e("Plog", logcatSwitch + "");
    }
}
