package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NewReleases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_releases);

        // Set listener for album art touch gesture
        View newReleasesAlbums = findViewById(R.id.new_releases_banner_image_view);
        newReleasesAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewReleases.this, AlbumScreen.class);
                startActivity(i);
            }
        });

        // Set listener for playlist art touch gesture
        // Listener for playlist display #1
        View newReleasesPlaylistsOne = findViewById(R.id.new_releases_playlist_one_image_view);
        newReleasesPlaylistsOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewReleases.this, PlaylistScreen.class);
                startActivity(i);
            }
        });

        // Listener for playlist display #1
        View newReleasesPlaylistsTwo = findViewById(R.id.new_releases_playlist_two_image_view);
        newReleasesPlaylistsTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewReleases.this, PlaylistScreen.class);
                startActivity(i);
            }
        });
    }
}
