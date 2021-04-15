package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AnimalsGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_game);

        Button levelOne = findViewById(R.id.level1_animals);
        levelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne.class);
                startActivity(intent);
            }
        });

        Button levelTwo = findViewById(R.id.level2_animals);
        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelTwo.class);
                startActivity(intent);
            }
        });


//        final MediaPlayer frog = MediaPlayer.create(this, R.raw.frog);
//        ImageButton f = findViewById(R.id.frog);
//        f.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                frog.start();
//            }
//        });

    }
}