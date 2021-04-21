package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_two);


        final MediaPlayer m_sound = MediaPlayer.create(this, R.raw.m);
        ImageButton m = findViewById(R.id.m_sound_btn);

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_sound.start();
            }
        });

        Button m_btn = findViewById(R.id.choice_m_1);
        Button g_btn = findViewById(R.id.choice_g_1);
        Button l_btn = findViewById(R.id.choice_l_1);

        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.correctAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(AlphabetLevelOne.correctAlphabetDB);
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo2.class);
                startActivity(intent);
                finish();
            }
        });

        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });

        l_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });


    }
}