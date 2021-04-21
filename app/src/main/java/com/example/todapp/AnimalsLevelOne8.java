package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one8);

        final MediaPlayer a8_sound = MediaPlayer.create(this, R.raw.rooster);
        ImageButton a8 = findViewById(R.id.a8_sound_btn);

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a8_sound.start();
            }
        });

        ImageButton rooster_button = findViewById(R.id.rooster_choice);
        ImageButton sheep_button = findViewById(R.id.sheep_choice);
        ImageButton cat_button = findViewById(R.id.cat_choice);

        rooster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne9.class);
                startActivity(intent);
                finish();
            }
        });

        sheep_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

        cat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

    }
}