package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class ProgressPage extends AppCompatActivity {

    Integer correctAnimals, wrongAnimals, correctAlphabet, wrongAlphabet, correctNumbers, wrongNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_page);


        //Text view for correctAnimal:
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("users");

        TextView xp_animal = findViewById(R.id.xp_animals);
        TextView wrong_animal = findViewById(R.id.animals_wrong);
        TextView xp_alph = findViewById(R.id.xp_alphabet);
        TextView wrong_alph = findViewById(R.id.alphabet_wrong);
        TextView xp_num = findViewById(R.id.number_xp);
        TextView wrong_num = findViewById(R.id.wrong_number);



        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snap) {
                if (snap.exists()) {
                    correctAnimals = snap.child(Login.enteredUsername).child("correctAnimals").getValue(Integer.class);
                    xp_animal.setText(String.valueOf(correctAnimals));
                    wrongAnimals = snap.child(Login.enteredUsername).child("wrongAnimals").getValue(Integer.class);
                    wrong_animal.setText(String.valueOf(wrongAnimals));

                    correctAlphabet = snap.child(Login.enteredUsername).child("correctAlphabet").getValue(Integer.class);
                    xp_alph.setText(String.valueOf(correctAlphabet));
                    wrongAlphabet = snap.child(Login.enteredUsername).child("wrongAlphabet").getValue(Integer.class);
                    wrong_alph.setText(String.valueOf(wrongAlphabet));

                    correctNumbers = snap.child(Login.enteredUsername).child("correctNumbers").getValue(Integer.class);
                    xp_num.setText(String.valueOf(correctNumbers));
                    wrongNumbers = snap.child(Login.enteredUsername).child("wrongNumbers").getValue(Integer.class);
                    wrong_num.setText(String.valueOf(wrongNumbers));

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });




        //info for alphabet
//        TextView xp_alph = findViewById(R.id.xp_alphabet);
//        TextView wrong_alph = findViewById(R.id.alphabet_wrong);
//        xp_alph.setText(String.valueOf(AlphabetLevelOne.xp));
//        wrong_alph.setText(String.valueOf(AlphabetLevelOne.wrong));

        //info for numbers
//        TextView xp_num = findViewById(R.id.number_xp);
//        TextView wrong_num = findViewById(R.id.wrong_number);
//        xp_num.setText(String.valueOf(NumbersLevelOne.xp_numbers));
//        wrong_num.setText(String.valueOf(NumbersLevelOne.wrong_numbers));

        //info for animal
//        TextView xp_animal = findViewById(R.id.xp_animals);
//        TextView wrong_animal = findViewById(R.id.animals_wrong);
//        xp_animal.setText(String.valueOf(correctAnimals));
//        xp_animal.setText(String.valueOf(AnimalsLevelOne.xp_animals));
//        wrong_animal.setText(String.valueOf(AnimalsLevelOne.wrong_animals));


    }
}