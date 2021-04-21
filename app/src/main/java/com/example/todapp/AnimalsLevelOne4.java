package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one4);


        ImageButton cat_button = findViewById(R.id.cat_choice);
        ImageButton cow_button = findViewById(R.id.cow_choice);
        ImageButton dog_button = findViewById(R.id.dog_choice);

        cat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne5.class);
                startActivity(intent);
                finish();
            }
        });

        cow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });

        dog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });
    }
}