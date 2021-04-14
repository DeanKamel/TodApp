package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne extends AppCompatActivity {

    //Experience points you gain after getting a correct response
    public static int xp = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one);


        final MediaPlayer s_sound = MediaPlayer.create(this, R.raw.s);
        ImageButton s = findViewById(R.id.s_sound_btn);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s_sound.start();
            }
        });

        Button s_btn = findViewById(R.id.choice_s);
        Button a_btn = findViewById(R.id.choice_a);
        Button i_btn = findViewById(R.id.choice_i);

        s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                xp++;
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne2.class);
                startActivity(intent);
                finish();
            }
        });

        a_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        i_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
            }
        });



    }
}