package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two);

        final MediaPlayer s1_sound = MediaPlayer.create(this, R.raw.s1);
        ImageButton n1 = findViewById(R.id.n1_sound_btn);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1_sound.start();
            }
        });

        Button n1_btn = findViewById(R.id.choice1_1);
        Button n2_btn = findViewById(R.id.choice2_1);
        Button n3_btn = findViewById(R.id.choice3_1);

        n1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo2.class);
                startActivity(intent);
                finish();
            }
        });

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}