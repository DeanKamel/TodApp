package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumbersGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_game);

        Button levelOne = findViewById(R.id.level1_num);
        levelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne.class);
                startActivity(intent);
            }
        });

        Button levelTwo = findViewById(R.id.level2_num);
        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumbersLevelTwo.class);
                startActivity(intent);
            }
        });

        Button levelThree = findViewById(R.id.level3_num);
        levelThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumbersLevelThree.class);
                startActivity(intent);
            }
        });




        final MediaPlayer n1 = MediaPlayer.create(this, R.raw.s1);
        final MediaPlayer n2 = MediaPlayer.create(this, R.raw.s2);
        final MediaPlayer n3 = MediaPlayer.create(this, R.raw.s3);
        final MediaPlayer n4 = MediaPlayer.create(this, R.raw.s4);
        final MediaPlayer n5 = MediaPlayer.create(this, R.raw.s5);
        final MediaPlayer n6 = MediaPlayer.create(this, R.raw.s6);
        final MediaPlayer n7 = MediaPlayer.create(this, R.raw.s7);
        final MediaPlayer n8 = MediaPlayer.create(this, R.raw.s8);
        final MediaPlayer n9 = MediaPlayer.create(this, R.raw.s9);
        final MediaPlayer n10 = MediaPlayer.create(this, R.raw.s10);


        Button s1 = findViewById(R.id.num1);
        Button s2 = findViewById(R.id.num2);
        Button s3 = findViewById(R.id.num3);
        Button s4 = findViewById(R.id.num4);
        Button s5 = findViewById(R.id.num5);
        Button s6 = findViewById(R.id.num6);
        Button s7 = findViewById(R.id.num7);
        Button s8 = findViewById(R.id.num8);
        Button s9 = findViewById(R.id.num9);
        Button s10 = findViewById(R.id.num10);



        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.start();
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.start();
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n3.start();
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n4.start();
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n5.start();
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n6.start();
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n7.start();
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n8.start();
            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n9.start();
            }
        });
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n10.start();
            }
        });

    }
}