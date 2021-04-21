package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three6);

        final MediaPlayer x_sound = MediaPlayer.create(this, R.raw.x);
        ImageButton x = findViewById(R.id.x_sound_btn);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x_sound.start();
            }
        });

        Button x_btn = findViewById(R.id.choice_x_6);
        Button z_btn = findViewById(R.id.choice_z_6);
        Button j_btn = findViewById(R.id.choice_j_6);

        x_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 3!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        z_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

        j_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

    }
}