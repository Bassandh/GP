package com.example.app_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (TextView) findViewById(R.id.forgot_password_btn);
        button2 = (TextView) findViewById(R.id.signup_btn);
        button1.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                openNextActivity1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity2();
            }

        });
    }
    public void openNextActivity1() {
        Intent intent = new Intent(this, F_P.class);
        startActivity(intent);
    }
    public void openNextActivity2() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}