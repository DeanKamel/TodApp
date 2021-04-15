package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three4);

        final MediaPlayer s14_sound = MediaPlayer.create(this, R.raw.s14);
        ImageButton n14 = findViewById(R.id.n14_sound_btn);

        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s14_sound.start();
            }
        });

        Button n12_btn = findViewById(R.id.choice12_4);
        Button n14_btn = findViewById(R.id.choice14_4);
        Button n16_btn = findViewById(R.id.choice16_4);

        n14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree5.class);
                startActivity(intent);
                finish();
            }
        });

        n12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n16_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}