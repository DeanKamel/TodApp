package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne extends AppCompatActivity {

    public static int wrong_animals = 0;
    public static int xp_animals = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one);


        final MediaPlayer a1_sound = MediaPlayer.create(this, R.raw.frog);
        ImageButton a1 = findViewById(R.id.a1_sound_btn);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1_sound.start();
            }
        });


       ImageButton frog_button = findViewById(R.id.frog_choice);
       ImageButton pig_button = findViewById(R.id.pig_choice);
       ImageButton elephant_button = findViewById(R.id.elephant_choice);

        frog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne2.class);
                startActivity(intent);
                finish();
            }
        });

        pig_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                wrong_animals++;
            }
        });

        elephant_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                wrong_animals++;
            }
        });

    }
}