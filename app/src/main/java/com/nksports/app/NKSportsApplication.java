package com.nksports.app;

import android.app.Application;

import com.onesignal.OneSignal;

public class NKSportsApplication extends Application {

    private static final String ONESIGNAL_APP_ID =
            "22428311-7325-4c45-8d5c-724c895fcddb";

    @Override
    public void onCreate() {
        super.onCreate();

        try {
            OneSignal.initWithContext(this, ONESIGNAL_APP_ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
