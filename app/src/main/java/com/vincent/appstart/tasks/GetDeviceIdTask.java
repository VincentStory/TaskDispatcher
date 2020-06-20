package com.vincent.appstart.tasks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;

import org.jay.launchstarter.Task;

public class GetDeviceIdTask extends Task {
    private String mDeviceId;

    @Override
    public boolean needWait() {
        return super.needWait();
    }

    @SuppressLint("MissingPermission")
    @Override
    public void run() {
        // 真正自己的代码
        TelephonyManager tManager = (TelephonyManager) mContext.getSystemService(
                Context.TELEPHONY_SERVICE);
        mDeviceId = tManager.getDeviceId();
//        MyApp app = (MyApp) mContext;
//        app.setDeviceId(mDeviceId);
    }
}
