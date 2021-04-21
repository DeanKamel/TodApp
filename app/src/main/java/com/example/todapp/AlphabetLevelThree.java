package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three);

        final MediaPlayer j_sound = MediaPlayer.create(this, R.raw.j);
        ImageButton j = findViewById(R.id.j_sound_btn);

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j_sound.start();
            }
        });

        Button j_btn = findViewById(R.id.choice_j_1);
        Button w_btn = findViewById(R.id.choice_w_1);
        Button x_btn = findViewById(R.id.choice_x_1);

        j_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.correctAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(AlphabetLevelOne.correctAlphabetDB);
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelThree2.class);
                startActivity(intent);
                finish();
            }
        });

        w_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });

        x_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });
    }
}