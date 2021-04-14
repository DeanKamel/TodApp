package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProgressPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_page);


        TextView xp_alph = findViewById(R.id.xp_alphabet);
        xp_alph.setText(String.valueOf(AlphabetLevelOne.xp));

    }
}