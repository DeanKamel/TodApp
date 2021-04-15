package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelOne7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one7);

        final MediaPlayer s7_sound = MediaPlayer.create(this, R.raw.s7);
        ImageButton n7 = findViewById(R.id.n7_sound_btn);

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s7_sound.start();
            }
        });

        ImageButton n7_btn = findViewById(R.id.choice_7_7);
        ImageButton n8_btn = findViewById(R.id.choice_8_7);
        ImageButton n10_btn = findViewById(R.id.choice_10_7);

        n7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne8.class);
                startActivity(intent);
                finish();
            }
        });

        n8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });



    }
}