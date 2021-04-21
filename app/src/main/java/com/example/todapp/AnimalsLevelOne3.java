package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one3);

        final MediaPlayer a3_sound = MediaPlayer.create(this, R.raw.lion);
        ImageButton a3 = findViewById(R.id.a3_sound_btn);

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a3_sound.start();
            }
        });

        ImageButton lion_button = findViewById(R.id.lion_choice);
        ImageButton horse_button = findViewById(R.id.horse_choice);
        ImageButton bird_button = findViewById(R.id.bird_choice);

        lion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.correctAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("correctAnimals").setValue(AnimalsLevelOne.correctAnimalDB);
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne4.class);
                startActivity(intent);
                finish();
            }
        });

        horse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);

            }
        });

        bird_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
            }
        });

    }
}