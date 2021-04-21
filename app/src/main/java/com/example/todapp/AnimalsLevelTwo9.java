package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelTwo9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_two9);


        ImageButton frog_button = findViewById(R.id.frog_choice);
        ImageButton cat_button = findViewById(R.id.cat_choice);
        ImageButton dog_button = findViewById(R.id.dog_choice);

        cat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelTwo10.class);
                startActivity(intent);
                finish();
            }
        });

        frog_button.setOnClickListener(new View.OnClickListener() {
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