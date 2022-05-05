package com.example.app_040922_nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    MotionLayout motionLayout;
    Button btn_animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        motionLayout = (MotionLayout)findViewById(R.id.motion_layout);

        new Handler().postDelayed(() -> { motionLayout.transitionToEnd(); },1000);
        new Handler().postDelayed(() -> { startActivity(new Intent(this, MainActivity.class)); finish(); },5000);

    }
}