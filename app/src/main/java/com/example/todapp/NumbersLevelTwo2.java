package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two2);

        final MediaPlayer s2_sound = MediaPlayer.create(this, R.raw.s2);
        ImageButton n2 = findViewById(R.id.n2_sound_btn);

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2_sound.start();
            }
        });

        Button n4_btn = findViewById(R.id.choice4_2);
        Button n2_btn = findViewById(R.id.choice2_2);
        Button n7_btn = findViewById(R.id.choice7_2);

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo3.class);
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

        n7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}