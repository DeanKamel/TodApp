package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three5);

        final MediaPlayer y_sound = MediaPlayer.create(this, R.raw.y);
        ImageButton y = findViewById(R.id.y_sound_btn);

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y_sound.start();
            }
        });

        Button x_btn = findViewById(R.id.choice_x_5);
        Button w_btn = findViewById(R.id.choice_w_5);
        Button y_btn = findViewById(R.id.choice_y_5);

        y_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelThree6.class);
                startActivity(intent);
                finish();
            }
        });

        w_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        x_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}