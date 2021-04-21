package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three);

        final MediaPlayer s11_sound = MediaPlayer.create(this, R.raw.s11);
        ImageButton n11 = findViewById(R.id.n11_sound_btn);

        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s11_sound.start();
            }
        });

        Button n11_btn = findViewById(R.id.choice11_1);
        Button n14_btn = findViewById(R.id.choice14_1);
        Button n16_btn = findViewById(R.id.choice16_1);

        n11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree2.class);
                startActivity(intent);
                finish();
            }
        });

        n14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });

        n16_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });
    }
}