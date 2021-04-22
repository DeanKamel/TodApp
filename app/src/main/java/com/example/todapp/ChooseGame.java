package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


public class ChooseGame extends AppCompatActivity {

    Button alphabetBtn, numbersBtn, animalsBtn;
    public static Integer alphaPlays, numberPlays, animalPlays;

    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference ref = database.getReference("users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_game);



        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    alphaPlays = snapshot.child(Login.enteredUsername).child("timesPlayedAlphabet").getValue(Integer.class);
                    numberPlays = snapshot.child(Login.enteredUsername).child("timesPlayedNumbers").getValue(Integer.class);
                    animalPlays = snapshot.child(Login.enteredUsername).child("timesPlayedAnimals").getValue(Integer.class);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });




        alphabetBtn = findViewById(R.id.alphabet_btn);
        numbersBtn = findViewById(R.id.numbers_btn);
        animalsBtn = findViewById(R.id.animals_btn);

        alphabetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alphaPlays++;
                ref.child(Login.usernameFromDB).child("timesPlayedAlphabet").setValue(alphaPlays);

                Intent intent = new Intent(getApplicationContext(), AlphabetGame.class);
                startActivity(intent);
                finish();
            }
        });

        numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberPlays++;
                ref.child(Login.usernameFromDB).child("timesPlayedNumbers").setValue(numberPlays);

                Intent intent = new Intent(getApplicationContext(), NumbersGame.class);
                startActivity(intent);
                finish();
            }
        });

        animalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animalPlays++;
                ref.child(Login.usernameFromDB).child("timesPlayedAnimals").setValue(animalPlays);

                Intent intent = new Intent(getApplicationContext(), AnimalsGame.class);
                startActivity(intent);
                finish();
            }
        });

    }
}