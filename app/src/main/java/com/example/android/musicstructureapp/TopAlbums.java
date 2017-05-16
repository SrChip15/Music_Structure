package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class TopAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_albums);

        // Set listener for each album in top albums screen to now playing screen
        RelativeLayout firstAlbumRowView = (RelativeLayout) findViewById(R.id.top_albums_row_one);
        firstAlbumRowView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(TopAlbums.this, NowPlaying.class);
                startActivity(i);
            }
        });

        RelativeLayout secondAlbumRowView = (RelativeLayout) findViewById(R.id.top_albums_row_two);
        secondAlbumRowView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(TopAlbums.this, NowPlaying.class);
                startActivity(i);
            }
        });

        RelativeLayout thirdAlbumRowView = (RelativeLayout) findViewById(R.id.top_albums_row_three);
        thirdAlbumRowView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(TopAlbums.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }
}
