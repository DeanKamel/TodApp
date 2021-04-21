package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class AnimalsLevelOne extends AppCompatActivity {

    public static int wrong_animals = 0;
    public static int xp_animals;

    public static Integer correctAnimalDB, wrongAnimalDB;

    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference ref = database.getReference("users");       //for correctAnimals
//    public static DatabaseReference ref2 = database.getReference("users");      //for wrongAnimals


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one);


        final MediaPlayer a1_sound = MediaPlayer.create(this, R.raw.frog);
        ImageButton a1 = findViewById(R.id.a1_sound_btn);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1_sound.start();
            }
        });


       ImageButton frog_button = findViewById(R.id.frog_choice);
       ImageButton pig_button = findViewById(R.id.pig_choice);
       ImageButton elephant_button = findViewById(R.id.elephant_choice);



        //get values for correctAnimals from DB
        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    correctAnimalDB = snapshot.child(Login.enteredUsername).child("correctAnimals").getValue(Integer.class);
                    wrongAnimalDB = snapshot.child(Login.enteredUsername).child("wrongAnimals").getValue(Integer.class);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });




        frog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                correctAnimalDB++;
                ref.child(Login.usernameFromDB).child("correctAnimals").setValue(correctAnimalDB);
                Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne2.class);
                startActivity(intent);
                finish();
            }
        });

        pig_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                wrongAnimalDB++;
                ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(wrongAnimalDB);

            }
        });

        elephant_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                wrongAnimalDB++;
                ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(wrongAnimalDB);

            }
        });

    }
}