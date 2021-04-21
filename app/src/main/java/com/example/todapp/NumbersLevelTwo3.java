package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumbersLevelTwo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_two3);

        final MediaPlayer s3_sound = MediaPlayer.create(this, R.raw.s3);
        ImageButton n3 = findViewById(R.id.n3_sound_btn);

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3_sound.start();
            }
        });

        Button n3_btn = findViewById(R.id.choice3_3);
        Button n8_btn = findViewById(R.id.choice8_3);
        Button n6_btn = findViewById(R.id.choice6_3);

        n3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.correctNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("correctNumbers").setValue(NumbersLevelOne.correctNumbersDB);
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo4.class);
                startActivity(intent);
                finish();
            }
        });

        n8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });

        n6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                NumbersLevelOne.wrongNumbersDB++;
                NumbersLevelOne.ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(NumbersLevelOne.wrongNumbersDB);
            }
        });
    }
}