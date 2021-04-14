package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one8);

        final MediaPlayer k_sound = MediaPlayer.create(this, R.raw.k);
        ImageButton k = findViewById(R.id.k_sound_btn);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k_sound.start();
            }
        });

        Button k_btn = findViewById(R.id.choice_k_8);
        Button i_btn = findViewById(R.id.choice_i_8);
        Button a_btn = findViewById(R.id.choice_a_8);

        k_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne9.class);
                startActivity(intent);
                finish();
            }
        });

        i_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        a_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });


    }
}