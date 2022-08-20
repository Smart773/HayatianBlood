package com.mango.hayatianblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        findViewById(R.id.btnCardSend).setOnClickListener(v->{
            Intent intent= new Intent(this,OtpVerificationPage.class);
            startActivity(intent);
        });
    }
}