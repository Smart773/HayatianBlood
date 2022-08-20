package com.mango.hayatianblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    LinearLayout block1;
    Animation bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    block1=findViewById(R.id.LogoBlock);
    bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);
    block1.setAnimation(bottom);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent =new Intent(SplashScreen.this,LoginPage.class);
            startActivity(intent);
            finish();
        }
    },2500);

    }
}