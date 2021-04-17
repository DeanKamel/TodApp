package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelOne9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one9);

        final MediaPlayer s9_sound = MediaPlayer.create(this, R.raw.s9);
        ImageButton n9 = findViewById(R.id.n9_sound_btn);

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s9_sound.start();
            }
        });

        ImageButton n9_btn = findViewById(R.id.choice_9_9);
        ImageButton n6_btn = findViewById(R.id.choice_6_9);
        ImageButton n7_btn = findViewById(R.id.choice_7_9);

        n9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne10.class);
                startActivity(intent);
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

        n7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrong_numbers++;
            }
        });
    }
}