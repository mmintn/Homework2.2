package com.example.homework2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast t = Toast.makeText(SplashActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
        t.show();

    }
}
