package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one7);

        ImageButton dog_button = findViewById(R.id.dog_choice);
        ImageButton bird_button = findViewById(R.id.bird_choice);
        ImageButton horse_button = findViewById(R.id.horse_choice);

        dog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne8.class);
                startActivity(intent);
                finish();
            }
        });

        bird_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

        horse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

    }
}