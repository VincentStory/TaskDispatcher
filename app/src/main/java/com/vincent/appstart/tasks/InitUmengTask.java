package com.vincent.appstart.tasks;

import com.umeng.commonsdk.UMConfigure;

import org.jay.launchstarter.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * 需要在getDeviceId之后执行
 */
public class InitUmengTask extends Task {
    @Override
    public List<Class<? extends Task>> dependsOn() {
        List<Class<? extends Task>> task = new ArrayList<>();
        task.add(GetDeviceIdTask.class);
        return task;
    }

    @Override
    public void run() {
        UMConfigure.init(mContext, "58edcfeb310c93091c000be2", "umeng",
                UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");
    }
}
