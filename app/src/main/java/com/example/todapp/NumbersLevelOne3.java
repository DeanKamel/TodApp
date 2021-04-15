package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelOne3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one3);

        final MediaPlayer s3_sound = MediaPlayer.create(this, R.raw.s3);
        ImageButton n3 = findViewById(R.id.n3_sound_btn);

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3_sound.start();
            }
        });

        ImageButton n3_btn = findViewById(R.id.choice_3_3);
        ImageButton n1_btn = findViewById(R.id.choice_1_3);
        ImageButton n4_btn = findViewById(R.id.choice_4_3);

        n3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne4.class);
                startActivity(intent);
                finish();
            }
        });

        n4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}