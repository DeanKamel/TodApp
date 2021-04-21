package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three3);

        final MediaPlayer w_sound = MediaPlayer.create(this, R.raw.w);
        ImageButton w = findViewById(R.id.w_sound_btn);

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w_sound.start();
            }
        });

        Button x_btn = findViewById(R.id.choice_x_3);
        Button v_btn = findViewById(R.id.choice_v_3);
        Button w_btn = findViewById(R.id.choice_w_3);

        w_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelThree4.class);
                startActivity(intent);
                finish();
            }
        });

        v_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

        x_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });
    }
}