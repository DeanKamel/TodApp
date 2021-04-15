package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two9);

        final MediaPlayer u_sound = MediaPlayer.create(this, R.raw.u);
        ImageButton u = findViewById(R.id.u_sound_btn);

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u_sound.start();
            }
        });

        Button u_btn = findViewById(R.id.choice_u_9);
        Button o_btn = findViewById(R.id.choice_o_9);
        Button d_btn = findViewById(R.id.choice_d_9);

        u_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetGame.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Completed Level 2!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        o_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        d_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}