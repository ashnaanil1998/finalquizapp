package com.example.ashnaanil.myapplicationmonday2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final MediaPlayer crowdCheeringMP = MediaPlayer.create(this, R.raw.cheer);
        Button play = (Button)  this.findViewById(R.id.start);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crowdCheeringMP.start();
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, MainActivity.class));
            }
        });
    }
}


