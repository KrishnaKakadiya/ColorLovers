package com.krishna.myapplication;

import android.app.Application;
import android.content.Context;

import com.krishna.myapplication.constant.Constant;
import com.krishna.myapplication.restfuls.RestApi;
import com.krishna.myapplication.restfuls.RestClient;

public class DemoApplication extends Application
{
    public static DemoApplication getApplication(Context context)
    {
        return (DemoApplication) context.getApplicationContext();
    }

    private int androidVersion = 4;

    public static int LOGLEVEL = 6;
    public static boolean ERROR = LOGLEVEL > 5;
    public static boolean WARN = LOGLEVEL > 4;
    public static boolean INFO = LOGLEVEL > 3;
    public static boolean DEBUG = LOGLEVEL > 2;
    public static boolean VERBOSE = LOGLEVEL > 1;
    RestClient restClient;
    @Override
    public void onCreate() {
        super.onCreate();

        setAndroidVersion(android.os.Build.VERSION.SDK_INT);
        restClient = new RestClient(getResources());
        restApi = restClient.getRestAPI();
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public static void printLogMessage(int logType, String logMessage)
    {
        if (logType == 5)
        {
            if (ERROR) {
                android.util.Log.e(Constant.TAG, logMessage);
            }
        }
        else
        {
            if (Constant.DEBUG)
            {
                switch (logType)
                {
                    case 1:
                        if (VERBOSE) {
                            android.util.Log.v(Constant.TAG, logMessage);
                        }
                        break;
                    case 2:
                        if (DEBUG) {
                            android.util.Log.d(Constant.TAG, logMessage);
                        }
                        break;
                    case 3:
                        if (INFO) {
                            android.util.Log.i(Constant.TAG, logMessage);
                        }
                        break;
                    case 4:
                        if (WARN) {
                            android.util.Log.w(Constant.TAG, logMessage);
                        }
                        break;
                }
            }
        }
    }

    private RestApi restApi = null;

    public RestApi getRestApi()
    {
        return restApi;
    }

}