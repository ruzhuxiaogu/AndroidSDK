package com.chinamobile.iot.onenet.sdksample;

import android.app.Application;

import com.chinamobile.iot.onenet.OneNetApi;
import com.chinamobile.iot.onenet.sdksample.utils.Preferences;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OneNetApi.init(this, true);

        String savedApiKey = Preferences.getInstance(this).getString(Preferences.API_KEY, null);
        if (savedApiKey != null) {
            OneNetApi.setApiKey(savedApiKey);
        }
    }
}