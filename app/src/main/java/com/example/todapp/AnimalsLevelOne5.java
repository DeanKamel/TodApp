package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one5);

        final MediaPlayer a5_sound = MediaPlayer.create(this, R.raw.duck);
        ImageButton a5 = findViewById(R.id.a5_sound_btn);

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a5_sound.start();
            }
        });

        ImageButton duck_button = findViewById(R.id.duck_choice);
        ImageButton elephant_button = findViewById(R.id.elephant_choice);
        ImageButton rooster_button = findViewById(R.id.rooster_choice);

        duck_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne6.class);
                startActivity(intent);
                finish();
            }
        });

        elephant_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

        rooster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

    }
}