package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two10);

        final MediaPlayer s10_sound = MediaPlayer.create(this, R.raw.s10);
        ImageButton n10 = findViewById(R.id.n10_sound_btn);

        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s10_sound.start();
            }
        });

        Button n10_btn = findViewById(R.id.choice10_10);
        Button n6_btn = findViewById(R.id.choice6_10);
        Button n2_btn = findViewById(R.id.choice2_10);

        n10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 2!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        n6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });
    }
}