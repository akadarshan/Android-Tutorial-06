package com.darshan.tutorial06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView txtWelcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtWelcomeMsg = findViewById(R.id.txtWelcomeMsg);
        Intent intent = getIntent();
        String data = intent.getStringExtra("userdata");
        txtWelcomeMsg.setText("Welcome " + data);
    }
}