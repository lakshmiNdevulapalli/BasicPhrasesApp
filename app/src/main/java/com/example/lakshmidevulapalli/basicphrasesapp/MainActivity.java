package com.example.lakshmidevulapalli.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {
        int id = view.getId();
        String buttonId = "";
        buttonId = view.getResources().getResourceEntryName(id);

        /**
         * get id for particular audio file in raw folder and replae dynamically each
         * time we change
         */
        int resourceId = getResources().getIdentifier(buttonId,"raw","com.example.lakshmidevulapalli.basicphrasesapp");

        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

        Log.i("Button tapped", buttonId);
    }
}
