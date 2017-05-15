package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlaylistScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_screen);

        // Set listener for the shuffle play button to point to now playing screen
        Button shufflePlayButtonView = (Button) findViewById(R.id.shuffle_play_button);
        shufflePlayButtonView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(PlaylistScreen.this, NowPlaying.class);
                startActivity(i);
            }
        });

        // Set listeners for each song of the playlist pointing to now playing screen
        // Song 1
        TextView song1TextView = (TextView) findViewById(R.id.song_1);
        song1TextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(PlaylistScreen.this, NowPlaying.class);
                startActivity(i);
            }
        });

        // Song 2
        TextView song2TextView = (TextView) findViewById(R.id.song_2);
        song2TextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(PlaylistScreen.this, NowPlaying.class);
                startActivity(i);
            }
        });

        // Song 3
        TextView song3TextView = (TextView) findViewById(R.id.song_3);
        song3TextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(PlaylistScreen.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }
}
