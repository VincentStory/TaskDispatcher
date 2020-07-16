package com.vincent.appstart;

import android.os.Bundle;
import android.os.Debug;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Debug.startMethodTracing("apptest");
        //

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
