package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three2);

        final MediaPlayer s12_sound = MediaPlayer.create(this, R.raw.s12);
        ImageButton n12 = findViewById(R.id.n12_sound_btn);

        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s12_sound.start();
            }
        });

        Button n12_btn = findViewById(R.id.choice12_2);
        Button n17_btn = findViewById(R.id.choice17_2);
        Button n18_btn = findViewById(R.id.choice18_2);

        n12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree3.class);
                startActivity(intent);
                finish();
            }
        });

        n17_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}