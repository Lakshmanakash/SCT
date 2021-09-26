package com.example.sct;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;
    Animation top_animation, bottom_animation,middle_animation;
    View first,second,third,fourth,fifth,sixth;
    ImageView logo1;
    TextView splashtext1,splashtext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middle_animation = AnimationUtils.loadAnimation(this,R.anim.animation);

        first = findViewById(R.id.first_line);
        second = findViewById(R.id.second_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);
        sixth = findViewById(R.id.sixth_line);
        logo1 = findViewById(R.id.logo);
        splashtext1 = findViewById(R.id.splashtext1);
        splashtext2 = findViewById(R.id.splashtext2);

        first.setAnimation(top_animation);
        second.setAnimation(top_animation);
        third.setAnimation(top_animation);
        fourth.setAnimation(top_animation);
        fifth.setAnimation(top_animation);
        sixth.setAnimation(top_animation);

        splashtext1.setAnimation(bottom_animation);
        splashtext2.setAnimation(bottom_animation);

        logo1.setAnimation(middle_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( splash.this,MainActivity.class);


                    startActivity(intent);
                    finish();
                }


        },SPLASH_TIME_OUT);

    }
}