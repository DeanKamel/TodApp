package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelOne2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one2);

            ImageButton sheep_button = findViewById(R.id.sheep_choice);
            ImageButton duck_button = findViewById(R.id.duck_choice);
            ImageButton dog_button = findViewById(R.id.dog_choice);

            sheep_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                    AnimalsLevelOne.xp_animals++;
                    Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne3.class);
                    startActivity(intent);
                    finish();
                }
            });

            duck_button.setOnClickListener(new View.OnClickListener() {
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