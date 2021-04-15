package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three6);


        final MediaPlayer s16_sound = MediaPlayer.create(this, R.raw.s16);
        ImageButton n16 = findViewById(R.id.n16_sound_btn);

        n16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s16_sound.start();
            }
        });

        Button n16_btn = findViewById(R.id.choice16_6);
        Button n18_btn = findViewById(R.id.choice18_6);
        Button n19_btn = findViewById(R.id.choice19_6);

        n16_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree7.class);
                startActivity(intent);
                finish();
            }
        });

        n18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n19_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}