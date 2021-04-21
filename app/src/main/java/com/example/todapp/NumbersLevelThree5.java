package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three5);

        final MediaPlayer s15_sound = MediaPlayer.create(this, R.raw.s15);
        ImageButton n15 = findViewById(R.id.n15_sound_btn);

        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s15_sound.start();
            }
        });

        Button n15_btn = findViewById(R.id.choice15_5);
        Button n13_btn = findViewById(R.id.choice13_5);
        Button n20_btn = findViewById(R.id.choice20_5);

        n15_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree6.class);
                startActivity(intent);
                finish();
            }
        });

        n13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });

        n20_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });
    }
}