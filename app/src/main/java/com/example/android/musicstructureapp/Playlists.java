package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Set listener for each playlist to playlist screen
        TextView playlistOneTextView = (TextView) findViewById(R.id.playlist_one);
        playlistOneTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(Playlists.this, PlaylistScreen.class);
                startActivity(i);
            }
        });

        // Set listener for each playlist to playlist screen
        TextView playlistTwoTextView = (TextView) findViewById(R.id.playlist_two);
        playlistTwoTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(Playlists.this, PlaylistScreen.class);
                startActivity(i);
            }
        });

        // Set listener for each playlist to playlist screen
        TextView playlistThreeTextView = (TextView) findViewById(R.id.playlist_three);
        playlistThreeTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(Playlists.this, PlaylistScreen.class);
                startActivity(i);
            }
        });
    }
}
