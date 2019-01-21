package com.android.byc.database;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/15 10:07
 * @description
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
