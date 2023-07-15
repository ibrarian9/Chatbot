package com.app.chatbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.app.chatbot.Adapter.VideoAdapter;
import com.app.chatbot.Data.VideoData;
import com.app.chatbot.Model.Video;

import java.util.ArrayList;

public class VideoMoodActivity extends AppCompatActivity {
    private RecyclerView rv;
    private VideoAdapter.RecyclerViewClickListener listener;
    private final ArrayList<Video> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_mood);

        rv = findViewById(R.id.rvVid);
        rv.setHasFixedSize(true);

        list.addAll(VideoData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        setOnClickListen();
        rv.setLayoutManager(new LinearLayoutManager(this));
        VideoAdapter vid = new VideoAdapter(list, listener);
        rv.setAdapter(vid);
    }

    private void setOnClickListen() {
        listener = (view, position) -> {
            Intent intent = new Intent(getApplicationContext(), VideoDetailActivity.class);
            intent.putExtra("name",list.get(position).getName());
            intent.putExtra("waktu", list.get(position).getDurasi());
            intent.putExtra("url", list.get(position).getUrl());
            startActivity(intent);
        };
    }
}