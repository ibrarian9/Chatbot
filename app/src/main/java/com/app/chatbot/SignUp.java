package com.app.chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    EditText editTextEmail, editTextPassword, editTextName, editTextPhone, editTextBirthdate, editTextGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextName = findViewById(R.id.name);
        editTextPhone = findViewById(R.id.phone);
        editTextBirthdate = findViewById(R.id.birthDate);
        editTextGender = findViewById(R.id.gender);

        editTextEmail.setOnClickListener(view -> {
            String email, password;
            email = String.valueOf(editTextEmail.getText());

        });
    }
}