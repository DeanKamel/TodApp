package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one7);


        final MediaPlayer c_sound = MediaPlayer.create(this, R.raw.c);
        ImageButton c = findViewById(R.id.c_sound_btn);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c_sound.start();
            }
        });

        Button k_btn = findViewById(R.id.choice_k_7);
        Button r_btn = findViewById(R.id.choice_r_7);
        Button c_btn = findViewById(R.id.choice_c_7);

        c_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.correctAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(AlphabetLevelOne.correctAlphabetDB);
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne8.class);
                startActivity(intent);
                finish();
            }
        });

        k_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });

        r_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });


    }
}