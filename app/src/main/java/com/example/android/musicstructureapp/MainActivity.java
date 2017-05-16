package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup listener for new releases text view
        TextView newReleasesTextView = (TextView) findViewById(R.id.new_releases_text_view);
        newReleasesTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewReleases.class);
                startActivity(i);
            }
        });

        // Setup listener for top songs text view
        TextView topSongsTextView = (TextView) findViewById(R.id.top_songs_text_view);
        topSongsTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TopSongs.class);
                startActivity(i);
            }
        });

        // Setup listener for top albums text view
        TextView topAlbumsTextView = (TextView) findViewById(R.id.top_albums_text_view);
        topAlbumsTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TopAlbums.class);
                startActivity(i);
            }
        });

        // Setup listener for recommended TextView to navigate to own screen
        TextView recommendedTextView = (TextView) findViewById(R.id.recommended_text_view);
        recommendedTextView.setOnClickListener(new View.OnClickListener() {

            // Implement onClick
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Recommended.class);
                startActivity(i);
            }
        });

    }
}
