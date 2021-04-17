package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProgressPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_page);

        //info for alphabet
        TextView xp_alph = findViewById(R.id.xp_alphabet);
        TextView wrong_alph = findViewById(R.id.alphabet_wrong);
        xp_alph.setText(String.valueOf(AlphabetLevelOne.xp));
        wrong_alph.setText(String.valueOf(AlphabetLevelOne.wrong));

        //info for numbers
        TextView xp_num = findViewById(R.id.number_xp);
        TextView wrong_num = findViewById(R.id.wrong_number);
        xp_num.setText(String.valueOf(NumbersLevelOne.xp_numbers));
        wrong_num.setText(String.valueOf(NumbersLevelOne.wrong_numbers));

        //info for animal
        TextView xp_animal = findViewById(R.id.xp_animals);
        TextView wrong_animal = findViewById(R.id.alphabet_wrong);
        xp_animal.setText(String.valueOf(AnimalsLevelOne.xp_animals));
        wrong_animal.setText(String.valueOf(AnimalsLevelOne.wrong_animals));


    }
}