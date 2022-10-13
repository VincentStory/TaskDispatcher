package com.vincent.appstart;

import android.app.Application;
import android.os.Debug;

import com.vincent.appstart.tasks.GetDeviceIdTask;
import com.vincent.appstart.tasks.InitStethoTask;
import com.vincent.appstart.tasks.InitUmengTask;
import com.vincent.appstart.tasks.delayinittask.DelayInitTaskA;
import com.vincent.appstart.tasks.delayinittask.DelayInitTaskB;

import org.jay.launchstarter.DelayInitDispatcher;
import org.jay.launchstarter.TaskDispatcher;

/**
 * @author wangwenbo
 * @date 2020/6/11.
 * GitHub：
 * email： wangwenbo@innotechx.com
 * description：
 */
public class MyApp extends Application {
    private static Application mApplication;

    public static Application getApplication() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        LaunchTimer.startRecord();
        mApplication = this;
        Debug.startMethodTracing("App");

        TaskDispatcher.init(MyApp.this);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();
        dispatcher
                .addTask(new InitStethoTask())
                .addTask(new InitUmengTask())
                .addTask(new GetDeviceIdTask())
                .start();

        dispatcher.await();


        DelayInitDispatcher delayInitDispatcher = new DelayInitDispatcher();
        delayInitDispatcher.addTask(new DelayInitTaskA())
                .addTask(new DelayInitTaskB())
                .start();



        LaunchTimer.endRecord();

        Debug.stopMethodTracing();

    }
}

