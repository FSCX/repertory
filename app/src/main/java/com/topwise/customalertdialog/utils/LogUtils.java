package com.topwise.materialdesign.util;

import android.util.Log;

/**
 * Description : 日志工具类
 * Author : fanshengcai
 * Email  : 18288294481@163.com
 * Blog   : 正在筹备
 * Date   : 18/06/13
 */
public class LogUtils {
    public static final boolean DEBUG = true;

    public static void v(String tag, String message) {
        if(DEBUG) {
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if(DEBUG) {
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if(DEBUG) {
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if(DEBUG) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if(DEBUG) {
            Log.e(tag, message);
        }
    }

    public static void e(String tag, String message, Exception e) {
        if(DEBUG) {
            Log.e(tag, message, e);
        }
    }
}