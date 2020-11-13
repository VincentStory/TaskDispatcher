package com.vincent.appstart;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.animation.Animation.INFINITE;

public class MainActivity extends AppCompatActivity {


    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Debug.startMethodTracing("apptest");
        //
        text=findViewById(R.id.text);






//





    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
