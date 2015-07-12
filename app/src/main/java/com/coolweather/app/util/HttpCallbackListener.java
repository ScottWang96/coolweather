package com.coolweather.app.util;

/**
 * Created by scottwang on 15-7-12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
