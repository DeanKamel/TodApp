package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class NumbersLevelOne extends AppCompatActivity {

    public static int xp_numbers = 0;
    public static int wrong_numbers = 0;

    public static Integer correctNumbersDB, wrongNumbersDB;

    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference ref = database.getReference("users");       //for correctNumbers
//    public static DatabaseReference ref2 = database.getReference("users");      //for wrongNumbers


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_level_one);


        final MediaPlayer s1_sound = MediaPlayer.create(this, R.raw.s1);
        ImageButton n1 = findViewById(R.id.n1_sound_btn);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1_sound.start();
            }
        });

        ImageButton n1_btn = findViewById(R.id.choice_1);
        ImageButton n2_btn = findViewById(R.id.choice_2);
        ImageButton n3_btn = findViewById(R.id.choice_3);


        //get values for correctNumbers from DB
        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    correctNumbersDB = snapshot.child(Login.enteredUsername).child("correctNumbers").getValue(Integer.class);
                    wrongNumbersDB = snapshot.child(Login.enteredUsername).child("wrongNumbers").getValue(Integer.class);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });



        n1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();

                correctNumbersDB++;
                ref.child(Login.usernameFromDB).child("correctNumbers").setValue(correctNumbersDB);

                Intent intent = new Intent(getApplicationContext(), NumbersLevelOne2.class);
                startActivity(intent);
                finish();
            }
        });

        n2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();

                wrongNumbersDB++;
                ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(wrongNumbersDB);

            }
        });

        n3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();

                wrongNumbersDB++;
                ref.child(Login.usernameFromDB).child("wrongNumbers").setValue(wrongNumbersDB);

            }
        });


    }
}