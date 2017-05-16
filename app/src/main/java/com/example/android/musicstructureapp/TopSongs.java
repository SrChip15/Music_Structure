package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class TopSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);

        // Set listeners for the list of songs in the songs screen
        // First song
        LinearLayout firstSongRowLinearLayout = (LinearLayout) findViewById(R.id.song_row_1);
        firstSongRowLinearLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(TopSongs.this, NowPlaying.class);
                startActivity(i);
            }
        });

        // Second song
        LinearLayout secondSongRowLinearLayout = (LinearLayout) findViewById(R.id.song_row_2);
        secondSongRowLinearLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(TopSongs.this, NowPlaying.class);
                startActivity(i);
            }
        });

        // Third song
        LinearLayout thirdSongRowLinearLayout = (LinearLayout) findViewById(R.id.song_row_3);
        thirdSongRowLinearLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(TopSongs.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }
}
