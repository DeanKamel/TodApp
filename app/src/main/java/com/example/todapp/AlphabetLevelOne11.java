package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one11);

        final MediaPlayer r_sound = MediaPlayer.create(this, R.raw.r);
        ImageButton r = findViewById(R.id.r_sound_btn);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r_sound.start();
            }
        });

        Button r_btn = findViewById(R.id.choice_r_11);
        Button n_btn = findViewById(R.id.choice_n_11);
        Button t_btn = findViewById(R.id.choice_t_11);

        r_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 1!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        n_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

        t_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

    }
}