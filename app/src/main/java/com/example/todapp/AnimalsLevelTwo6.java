package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalsLevelTwo6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_two6);


        ImageButton bird_button = findViewById(R.id.bird_choice);
        ImageButton frog_button = findViewById(R.id.frog_choice);
        ImageButton pig_button = findViewById(R.id.pig_choice);

        bird_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.xp_animals++;
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelTwo7.class);
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

        pig_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AnimalsLevelOne.wrong_animals++;
            }
        });



    }
}