package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelOne2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one2);

        final MediaPlayer s2_sound = MediaPlayer.create(this, R.raw.s2);
        ImageButton n2 = findViewById(R.id.n2_sound_btn);

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2_sound.start();
            }
        });

        ImageButton n4_btn = findViewById(R.id.choice_4_2);
        ImageButton n2_btn = findViewById(R.id.choice_2_2);
        ImageButton n5_btn = findViewById(R.id.choice_5_2);

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne3.class);
                startActivity(intent);
                finish();
            }
        });

        n4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });

        n5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });


    }
}