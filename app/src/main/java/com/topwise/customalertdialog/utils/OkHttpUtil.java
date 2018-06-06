package com.topwise.customalertdialog.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 这是一个第三方okhttp的网络请求工具
 * 1.集合okhttp
 * 2.编写
 * 3.调用的时候操作： OkHttpUtil.sendOkHttpRequest("http://www.baidu.com", new okhttp3.Callback() {
    @Override
    public void onFailure(Call call, IOException e) {
        //访问失败的时候操作
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        httpConetnt.setText(response.body().toString());
    }
    });
 *
 * })
 */
public class OkHttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
    //比如调用的时候
}
