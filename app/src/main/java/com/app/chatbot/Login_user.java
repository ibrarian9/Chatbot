package com.app.chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> startActivity(new Intent(Login_user.this, Home.class)));
    }
}