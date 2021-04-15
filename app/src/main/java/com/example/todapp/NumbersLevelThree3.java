package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelThree3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_three3);

        final MediaPlayer s13_sound = MediaPlayer.create(this, R.raw.s13);
        ImageButton n13 = findViewById(R.id.n13_sound_btn);

        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s13_sound.start();
            }
        });

        Button n13_btn = findViewById(R.id.choice13_3);
        Button n14_btn = findViewById(R.id.choice14_3);
        Button n11_btn = findViewById(R.id.choice11_3);

        n13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.xp_numbers++;
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree4.class);
                startActivity(intent);
                finish();
            }
        });

        n14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        n11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}