package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two4);

        final MediaPlayer o_sound = MediaPlayer.create(this, R.raw.o);
        ImageButton o = findViewById(R.id.o_sound_btn);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o_sound.start();
            }
        });

        Button o_btn = findViewById(R.id.choice_o_4);
        Button f_btn = findViewById(R.id.choice_f_4);
        Button d_btn = findViewById(R.id.choice_d_4);

        o_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo5.class);
                startActivity(intent);
                finish();
            }
        });

        f_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });

        d_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrong++;
            }
        });
    }
}