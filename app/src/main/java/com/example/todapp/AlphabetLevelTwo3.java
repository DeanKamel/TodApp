package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two3);

        final MediaPlayer g_sound = MediaPlayer.create(this, R.raw.g);
        ImageButton g = findViewById(R.id.g_sound_btn);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_sound.start();
            }
        });

        Button g_btn = findViewById(R.id.choice_g_3);
        Button q_btn = findViewById(R.id.choice_q_3);
        Button u_btn = findViewById(R.id.choice_u_3);

        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo4.class);
                startActivity(intent);
                finish();
            }
        });

        q_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        u_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}