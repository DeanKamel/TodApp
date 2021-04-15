package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two9);

        final MediaPlayer s9_sound = MediaPlayer.create(this, R.raw.s9);
        ImageButton n9 = findViewById(R.id.n9_sound_btn);

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s9_sound.start();
            }
        });

        Button n9_btn = findViewById(R.id.choice9_9);
        Button n7_btn = findViewById(R.id.choice7_9);
        Button n8_btn = findViewById(R.id.choice8_9);

        n9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo10.class);
                startActivity(intent);
                finish();
            }
        });

        n7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}