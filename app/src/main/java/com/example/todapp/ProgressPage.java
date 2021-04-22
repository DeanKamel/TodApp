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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProgressPage extends AppCompatActivity {

    Integer correctAnimals, wrongAnimals, correctAlphabet, wrongAlphabet, correctNumbers, wrongNumbers = 0;
    Integer alphabetPlays, animalPlays, numberPlays;
    Double animP,alphaP,numP;



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
        TextView favGame = findViewById(R.id.favoriteGame);

        TextView animalPercent = findViewById(R.id.animPercent);
        TextView numberPercent = findViewById(R.id.numPercent);
        TextView alphabetPercent = findViewById(R.id.alphaPercent);

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

                    alphabetPlays = snap.child(Login.enteredUsername).child("timesPlayedAlphabet").getValue(Integer.class);
                    animalPlays = snap.child(Login.enteredUsername).child("timesPlayedAnimals").getValue(Integer.class);
                    numberPlays = snap.child(Login.enteredUsername).child("timesPlayedNumbers").getValue(Integer.class);

                    String favorite;
                    if(alphabetPlays > animalPlays && alphabetPlays > numberPlays)
                        favorite = "Alphabet Game";
                    else if(numberPlays > animalPlays && numberPlays > alphabetPlays)
                        favorite = "Numbers Game";
                    else
                        favorite = "Animals Game";

                    favGame.setText(favorite);

                    //set the decimal points to 2
                    DecimalFormat df = new DecimalFormat("##.##");
                    df.setRoundingMode(RoundingMode.DOWN);

                    animP = Double.valueOf(df.format((((double)correctAnimals / (correctAnimals + wrongAnimals)) * 100)));
                    numP = Double.valueOf(df.format((((double)correctNumbers / (correctNumbers + wrongNumbers)) * 100)));
                    alphaP = Double.valueOf(df.format((((double)correctAlphabet/ (wrongAlphabet + correctAlphabet)) * 100)));
                    animalPercent.setText(String.valueOf(animP) + '%');
                    alphabetPercent.setText(String.valueOf(alphaP)+ '%');
                    numberPercent.setText(String.valueOf(numP) + '%');
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