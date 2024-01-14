package com.example.rulewithlaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Animatable;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splash_screen extends AppCompatActivity {

    Animation text;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        text= AnimationUtils.loadAnimation(this,R.anim.text);

        text1=findViewById(R.id.text1);
        text1.startAnimation(text);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent splash=new Intent(Splash_screen.this,Login.class);
                startActivity(splash);
                finish();

            }
        },3000);



    }
}