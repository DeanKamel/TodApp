package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two8);

        final MediaPlayer s8_sound = MediaPlayer.create(this, R.raw.s8);
        ImageButton n8 = findViewById(R.id.n8_sound_btn);

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s8_sound.start();
            }
        });

        Button n8_btn = findViewById(R.id.choice8_8);
        Button n3_btn = findViewById(R.id.choice3_8);
        Button n10_btn = findViewById(R.id.choice10_8);

        n8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo9.class);
                startActivity(intent);
                finish();
            }
        });

        n3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });

        n10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });
    }
}