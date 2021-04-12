package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseGame extends AppCompatActivity {

    Button alphabetBtn, numbersBtn, animalsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_game);

        alphabetBtn = findViewById(R.id.alphabet_btn);
        numbersBtn = findViewById(R.id.numbers_btn);
        animalsBtn = findViewById(R.id.animals_btn);

        alphabetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetGame.class);
                startActivity(intent);
                finish();
            }
        });

        numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumbersGame.class);
                startActivity(intent);
                finish();
            }
        });

        animalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AnimalsGame.class);
                startActivity(intent);
                finish();
            }
        });

    }
}