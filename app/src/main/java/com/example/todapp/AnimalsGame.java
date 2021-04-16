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


        final MediaPlayer bird = MediaPlayer.create(this, R.raw.birds);
        ImageButton b = findViewById(R.id.bird);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bird.start();
            }
        });

    }
}