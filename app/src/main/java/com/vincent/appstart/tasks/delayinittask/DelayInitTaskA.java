package com.vincent.appstart.tasks.delayinittask;

import android.util.Log;

import org.jay.launchstarter.MainTask;

public class DelayInitTaskA extends MainTask {

    @Override
    public void run() {
        // 模拟一些操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("DelayInitTaskA finished", "");
    }
}
