package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three8);

        final MediaPlayer s18_sound = MediaPlayer.create(this, R.raw.s18);
        ImageButton n18 = findViewById(R.id.n18_sound_btn);

        n18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s18_sound.start();
            }
        });

        Button n18_btn = findViewById(R.id.choice18_8);
        Button n13_btn = findViewById(R.id.choice13_8);
        Button n14_btn = findViewById(R.id.choice14_8);

        n18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree9.class);
                startActivity(intent);
                finish();
            }
        });

        n13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}