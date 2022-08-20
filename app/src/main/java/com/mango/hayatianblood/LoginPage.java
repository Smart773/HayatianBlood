package com.mango.hayatianblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        findViewById(R.id.btnTxtRegisterNow).setOnClickListener(v->{
            Intent intent= new Intent(this,RegisterPage.class);
            startActivity(intent);
        });

        findViewById(R.id.btnCardSignUp).setOnClickListener(v->{
            Intent intent= new Intent(this,HomeMapsActivity.class);
            startActivity(intent);
        });

    }
}