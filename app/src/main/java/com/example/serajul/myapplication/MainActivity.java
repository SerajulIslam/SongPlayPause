package com.example.serajul.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer song;
    Button buttonPlay;
    Button buttonPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlay = findViewById(R.id.playId);
        Button buttonPause= findViewById(R.id.pauseId);
        Button buttonStop = findViewById(R.id.stopId);


        song = MediaPlayer.create(MainActivity.this, R.raw.guiter);


        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!song.isPlaying()){
                    song.start();
                }
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (song.isPlaying()){
                    song.pause();
                }else{song.start();}

            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                song = MediaPlayer.create(MainActivity.this, R.raw.organ);
            }
        });


            }
        }