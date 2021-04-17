package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AnimalsLevelOne extends AppCompatActivity {

    public static int wrong_animals = 0;
    public static int xp_animals = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one);
    }
}