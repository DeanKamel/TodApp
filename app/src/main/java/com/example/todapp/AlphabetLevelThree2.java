package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three2);

        final MediaPlayer z_sound = MediaPlayer.create(this, R.raw.z);
        ImageButton z = findViewById(R.id.z_sound_btn);

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z_sound.start();
            }
        });

        Button z_btn = findViewById(R.id.choice_z_2);
        Button y_btn = findViewById(R.id.choice_y_2);
        Button w_btn = findViewById(R.id.choice_w_2);

        z_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelThree3.class);
                startActivity(intent);
                finish();
            }
        });

        w_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

        y_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });
    }
}