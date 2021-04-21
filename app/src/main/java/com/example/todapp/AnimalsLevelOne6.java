package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one6);

        final MediaPlayer a6_sound = MediaPlayer.create(this, R.raw.pig);
        ImageButton a6 = findViewById(R.id.a6_sound_btn);

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a6_sound.start();
            }
        });

        ImageButton pig_button = findViewById(R.id.pig_choice);
        ImageButton frog_button = findViewById(R.id.frog_choice);
        ImageButton lion_button = findViewById(R.id.lion_choice);

        pig_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.correctAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("correctAnimals").setValue(AnimalsLevelOne.correctAnimalDB);
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne7.class);
                startActivity(intent);
                finish();
            }
        });

        frog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
            }
        });

        lion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
            }
        });

    }
}