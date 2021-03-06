package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelTwo6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_two6);

        final MediaPlayer lion = MediaPlayer.create(this, R.raw.lion_p);


        ImageButton bird_button = findViewById(R.id.bird_choice);
        ImageButton frog_button = findViewById(R.id.frog_choice);
        ImageButton pig_button = findViewById(R.id.pig_choice);

        bird_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.correctAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("correctAnimals").setValue(AnimalsLevelOne.correctAnimalDB);
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelTwo7.class);
                startActivity(intent);
                lion.start();
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

        pig_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
            }
        });



    }
}