package com.app.chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button urShine, movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        urShine = findViewById(R.id.btnUrShine);
        movie = findViewById(R.id.btnUrMovie);

        urShine.setOnClickListener(view -> startActivity(new Intent(Home.this, UrShineActivity.class)));
        movie.setOnClickListener(view -> startActivity(new Intent(Home.this, VideoMoodActivity.class)));

    }
}