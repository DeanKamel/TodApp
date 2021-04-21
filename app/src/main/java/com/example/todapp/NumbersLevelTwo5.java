package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two5);

        final MediaPlayer s5_sound = MediaPlayer.create(this, R.raw.s5);
        ImageButton n5 = findViewById(R.id.n5_sound_btn);

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s5_sound.start();
            }
        });

        Button n5_btn = findViewById(R.id.choice5_5);
        Button n10_btn = findViewById(R.id.choice10_5);
        Button n2_btn = findViewById(R.id.choice2_5);

        n5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.correctNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("correctNumbers").setValue(NumbersLevelOne.correctNumbersDB);
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo6.class);
                startActivity(intent);
                finish();
            }
        });

        n10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });
    }
}