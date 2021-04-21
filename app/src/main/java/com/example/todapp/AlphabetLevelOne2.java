package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlphabetLevelOne2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_level_one2);


        final MediaPlayer a_sound = MediaPlayer.create(this, R.raw.a);
        ImageButton s = findViewById(R.id.a_sound_btn);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a_sound.start();
            }
        });

        Button t_btn = findViewById(R.id.choice_t_2);
        Button a_btn = findViewById(R.id.choice_a_2);
        Button p_btn = findViewById(R.id.choice_p_2);

        a_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                AlphabetLevelOne.correctAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(AlphabetLevelOne.correctAlphabetDB);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne3.class);
                startActivity(intent);
                finish();
            }
        });

        t_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
        });

        p_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                AlphabetLevelOne.wrongAlphabetDB++;
                AlphabetLevelOne.ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(AlphabetLevelOne.wrongAlphabetDB);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
        });

    }
}