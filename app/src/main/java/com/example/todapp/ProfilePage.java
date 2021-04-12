package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.FirebaseDatabase;

public class ProfilePage extends AppCompatActivity {


    TextInputLayout profileName, email, username;

    FirebaseDatabase rootNode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);


        profileName = findViewById(R.id.profile_name);
        profileName = findViewById(R.id.profile_email);
        profileName = findViewById(R.id.profile_username);



//        displayProfileData();

    }

//    private void displayProfileData() {
//        Intent intent = getIntent();
//        String user_name = intent.getStringExtra("name");
//        String user_username = intent.getStringExtra("username");
//        String user_email = intent.getStringExtra("email");
//
//        profileName.getEditText().setText(user_name);
//        username.getEditText().setText(user_username);
//        email.getEditText().setText(user_email);
//
//
//
//    }
}