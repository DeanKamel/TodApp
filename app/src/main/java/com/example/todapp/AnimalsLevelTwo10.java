package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelTwo10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_two10);


        ImageButton horse_button = findViewById(R.id.horse_choice);
        ImageButton pig_button = findViewById(R.id.pig_choice);
        ImageButton cow_button = findViewById(R.id.cow_choice);

        horse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.correctAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("correctAnimals").setValue(AnimalsLevelOne.correctAnimalDB);
                Intent intent = new Intent(getApplicationContext(), AnimalsGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 2!!!", Toast.LENGTH_SHORT).show();
                finish();
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

        cow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrongAnimalDB++;
                AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
            }
        });
        
    }
}