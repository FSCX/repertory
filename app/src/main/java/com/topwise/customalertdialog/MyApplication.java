package com.topwise.customalertdialog;

import android.app.Application;
import android.content.Context;

/**
 * 1.管理程序内一些全局的状态信息（如Context）
 * 2.接下来我么需要告诉系统，当程序启动的时候应该初始化MyApplication类。而不是默认的Application。
 * 具体操作是在AndroidManifest.xml文件中的<application>指定全路径</application>即可
 * 3.在如何地方调用的时候执行代码MyApplication.getmContext()即可得到context
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
    public static Context getmContext(){
        return mContext;
    }
}
