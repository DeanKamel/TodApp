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

public class AnimalsLevelOne2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_level_one2);

            final MediaPlayer a2_sound = MediaPlayer.create(this, R.raw.sheep);
            ImageButton a2 = findViewById(R.id.a2_sound_btn);

            a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a2_sound.start();
                }
            });


            ImageButton sheep_button = findViewById(R.id.sheep_choice);
            ImageButton duck_button = findViewById(R.id.duck_choice);
            ImageButton dog_button = findViewById(R.id.dog_choice);



        sheep_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Correct! +1xp", Toast.LENGTH_SHORT).show();
                    AnimalsLevelOne.correctAnimalDB++;
                    AnimalsLevelOne.ref.child(Login.usernameFromDB).child("correctAnimals").setValue(AnimalsLevelOne.correctAnimalDB);

                    Intent intent = new Intent(getApplicationContext(), AnimalsLevelOne3.class);
                    startActivity(intent);
                    finish();
                }
            });

            duck_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                    AnimalsLevelOne.wrongAnimalDB++;
                    AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
                }
            });

            dog_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Wrong! Try Again", Toast.LENGTH_SHORT).show();
                    AnimalsLevelOne.wrongAnimalDB++;
                    AnimalsLevelOne.ref.child(Login.usernameFromDB).child("wrongAnimals").setValue(AnimalsLevelOne.wrongAnimalDB);
                }
            });
    }
}