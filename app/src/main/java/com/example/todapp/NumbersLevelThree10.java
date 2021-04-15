package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three10);

        final MediaPlayer s20_sound = MediaPlayer.create(this, R.raw.s20);
        ImageButton n20 = findViewById(R.id.n20_sound_btn);

        n20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s20_sound.start();
            }
        });

        Button n20_btn = findViewById(R.id.choice20_10);
        Button n17_btn = findViewById(R.id.choice17_10);
        Button n12_btn = findViewById(R.id.choice12_10);

        n20_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 3!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        n17_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}