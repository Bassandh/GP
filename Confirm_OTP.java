package com.example.app_login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirm_OTP extends AppCompatActivity {
    private TextView button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_otp);

        button = (TextView) findViewById(R.id.Submit_OTP_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
    }
    public void openNextActivity(){
        Intent intent = new Intent(this, NewPassword.class);
        startActivity(intent);
    }
}
