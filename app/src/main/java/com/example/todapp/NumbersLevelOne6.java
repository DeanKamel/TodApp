package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelOne6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one6);


        final MediaPlayer s6_sound = MediaPlayer.create(this, R.raw.s6);
        ImageButton n6 = findViewById(R.id.n6_sound_btn);

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s6_sound.start();
            }
        });

        ImageButton n6_btn = findViewById(R.id.choice_6_6);
        ImageButton n8_btn = findViewById(R.id.choice_8_6);
        ImageButton n9_btn = findViewById(R.id.choice_9_6);

        n6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.correctNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("correctNumbers").setValue(NumbersLevelOne.correctNumbersDB);
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne7.class);
                startActivity(intent);
                finish();
            }
        });

        n8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });

        n9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });
    }
}