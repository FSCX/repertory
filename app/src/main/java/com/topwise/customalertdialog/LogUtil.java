package com.topwise.customalertdialog;

import android.util.Log;

/**
 * 定制自己日志工具
 */
public class LogUtil {
    public static final int VERBOSE = 1;
    public static final int DEBUG = VERBOSE + 1;
    public static final int INFO = DEBUG + 1;
    public static final int WARN = INFO + 1;
    public static final int ERROR = WARN + 1;
    public static final int NOTHING = ERROR + 1;

    public static final int level = VERBOSE;

    public static void v(String tag,String msg){
        if(level <= VERBOSE){
            Log.v(tag, msg);
        }
    }
    public static void d(String tag,String msg){
        if(level <= DEBUG){
            Log.d(tag, msg);
        }
    }
    public static void i(String tag,String msg){
        if(level <= INFO){
            Log.i(tag, msg);
        }
    }
    public static void w(String tag,String msg){
        if(level <=WARN){
            Log.w(tag, msg);
        }
    }
    public static void e(String tag,String msg){
        if(level <= ERROR){
            Log.e(tag,msg);
        }
    }
}
