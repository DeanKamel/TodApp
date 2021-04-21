package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelThree4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_three4);

        final MediaPlayer v_sound = MediaPlayer.create(this, R.raw.v);
        ImageButton v = findViewById(R.id.v_sound_btn);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_sound.start();
            }
        });

        Button j_btn = findViewById(R.id.choice_j_4);
        Button v_btn = findViewById(R.id.choice_v_4);
        Button y_btn = findViewById(R.id.choice_y_4);

        v_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.correctAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(AlphabetLevelOne.correctAlphabetDB);
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelThree5.class);
                startActivity(intent);
                finish();
            }
        });

        j_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });

        y_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
            }
        });

    }
}