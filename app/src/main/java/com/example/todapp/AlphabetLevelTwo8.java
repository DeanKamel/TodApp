package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two8);

        final MediaPlayer q_sound = MediaPlayer.create(this, R.raw.q);
        ImageButton q = findViewById(R.id.q_sound_btn);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q_sound.start();
            }
        });

        Button q_btn = findViewById(R.id.choice_q_8);
        Button f_btn = findViewById(R.id.choice_f_8);
        Button l_btn = findViewById(R.id.choice_l_8);

        q_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo9.class);
                startActivity(intent);
                finish();
            }
        });

        f_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        l_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}