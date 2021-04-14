package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two6);

        final MediaPlayer f_sound = MediaPlayer.create(this, R.raw.f);
        ImageButton f = findViewById(R.id.f_sound_btn);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f_sound.start();
            }
        });

        Button f_btn = findViewById(R.id.choice_f_6);
        Button u_btn = findViewById(R.id.choice_u_6);
        Button o_btn = findViewById(R.id.choice_o_6);

        f_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo7.class);
                startActivity(intent);
                finish();
            }
        });

        u_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        o_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });


    }
}