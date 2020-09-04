package com.darshan.tutorial06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText login_email,login_password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valEmail = login_email.getText().toString();
                String valPassword = login_password.getText().toString();

                if(!Patterns.EMAIL_ADDRESS.matcher(valEmail).matches()){
                    Toast.makeText(Login.this,"Email Format is Not Valid.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(valEmail.equals("admin@gmail.com") && valPassword.equals("admin")){
                    Intent intent = new Intent(Login.this,Welcome.class);
                    intent.putExtra("userdata",valEmail);
                    startActivity(intent);
                    finish();
                    Toast.makeText(Login.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Login.this,"Invalid Username OR Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}