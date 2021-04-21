package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class AlphabetLevelOne extends AppCompatActivity {

    //Experience points you gain after getting a correct response
    public static int xp = 0;
    public static int wrong = 0;


    public static Integer correctAlphabetDB, wrongAlphabetDB;

    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference ref = database.getReference("users");       //for correctAlphabet
//    public static DatabaseReference ref2 = database.getReference("users");      //for wrongAlphabet



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


        //get values for correctAlphabet from DB
        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    correctAlphabetDB = snapshot.child(Login.enteredUsername).child("correctAlphabet").getValue(Integer.class);
                    wrongAlphabetDB = snapshot.child(Login.enteredUsername).child("wrongAlphabet").getValue(Integer.class);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });




        s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
//                xp++;
                correctAlphabetDB++;
                ref.child(Login.usernameFromDB).child("correctAlphabet").setValue(correctAlphabetDB);

                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne2.class);
                startActivity(intent);
                finish();
            }
        });

        a_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
//                wrong++;
                wrongAlphabetDB++;
                ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(wrongAlphabetDB);

            }
        });

        i_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                wrongAlphabetDB++;
                ref.child(Login.usernameFromDB).child("wrongAlphabet").setValue(wrongAlphabetDB);

            }
        });



    }
}