package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one6);

        final MediaPlayer n_sound = MediaPlayer.create(this, R.raw.n);
        ImageButton n = findViewById(R.id.n_sound_btn);

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n_sound.start();
            }
        });

        Button n_btn = findViewById(R.id.choice_n_6);
        Button h_btn = findViewById(R.id.choice_h_6);
        Button s_btn = findViewById(R.id.choice_s_6);

        n_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne7.class);
                startActivity(intent);
                finish();
            }
        });

        h_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });


    }
}