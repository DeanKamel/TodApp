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


        final MediaPlayer dog = MediaPlayer.create(this, R.raw.dog_p);
        Button levelTwo = findViewById(R.id.level2_animals);
        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelTwo1.class);
                startActivity(intent);
                dog.start();
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

        final MediaPlayer frog = MediaPlayer.create(this, R.raw.frog);
        ImageButton frog_btn = findViewById(R.id.frog);
        frog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frog.start();
            }
        });

        final MediaPlayer cat = MediaPlayer.create(this, R.raw.cat);
        ImageButton cat_btn = findViewById(R.id.cat);
        cat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat.start();
            }
        });

        final MediaPlayer dog2 = MediaPlayer.create(this, R.raw.dog);
        ImageButton dog_btn = findViewById(R.id.dog);
        dog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog2.start();
            }
        });

        final MediaPlayer rooster = MediaPlayer.create(this, R.raw.rooster);
        ImageButton rooster_btn = findViewById(R.id.rooster);
        rooster_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rooster.start();
            }
        });

        final MediaPlayer duck = MediaPlayer.create(this, R.raw.duck);
        ImageButton duck_btn = findViewById(R.id.duck);
        duck_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duck.start();
            }
        });


        final MediaPlayer horse = MediaPlayer.create(this, R.raw.horse);
        ImageButton horse_btn = findViewById(R.id.horse);
        horse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horse.start();
            }
        });


        final MediaPlayer cow = MediaPlayer.create(this, R.raw.cow);
        ImageButton cow_btn = findViewById(R.id.cow);
        cow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cow.start();
            }
        });


        final MediaPlayer lion = MediaPlayer.create(this, R.raw.lion);
        ImageButton lion_btn = findViewById(R.id.lion);
        lion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lion.start();
            }
        });


        final MediaPlayer elephant = MediaPlayer.create(this, R.raw.elephant);
        ImageButton elephant_btn = findViewById(R.id.elephant);
        elephant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elephant.start();
            }
        });

        final MediaPlayer pig = MediaPlayer.create(this, R.raw.pig);
        ImageButton pig_btn = findViewById(R.id.pig);
        pig_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pig.start();
            }
        });


        final MediaPlayer sheep = MediaPlayer.create(this, R.raw.sheep);
        ImageButton sheep_btn = findViewById(R.id.sheep);
        sheep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheep.start();
            }
        });
    }
}