package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {



    TextInputLayout textInputEditTextName, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail;
    Button signup_button;
    TextView loginView;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textInputEditTextName = findViewById(R.id.profile_name);
        textInputEditTextUsername = findViewById(R.id.profile_username);
        textInputEditTextPassword = findViewById(R.id.textInputLayoutPassword);
        textInputEditTextEmail = findViewById(R.id.profile_email);



        signup_button = findViewById(R.id.signup_btn);
        loginView = findViewById(R.id.loginText);



        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                int result = userRegister(v);

                if (result == 1) {
                    Toast.makeText(getApplicationContext(), "Sign up successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


        loginView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

    }


    private Boolean validateName() {
        String data = textInputEditTextName.getEditText().getText().toString();

        if (data.isEmpty()){
            textInputEditTextName.setError("Must enter name");
            return false;
        }
        else{
            textInputEditTextName.setError(null);
            textInputEditTextName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateUsername() {
        String data = textInputEditTextUsername.getEditText().getText().toString();
        if (data.isEmpty()){
            textInputEditTextUsername.setError("Must enter username");
            return false;
        }
        else if(data.length() >= 40){
            textInputEditTextUsername.setError("Username too long");
            return false;
        }
        else{
            textInputEditTextUsername.setError(null);
            textInputEditTextUsername.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateEmail() {
        String data = textInputEditTextEmail.getEditText().getText().toString();
        String emailPatternValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (data.isEmpty()){
            textInputEditTextEmail.setError("Must enter email");
            return false;
        }
        else if (!data.matches(emailPatternValidation)) {
            textInputEditTextEmail.setError("Invalid email");
            return false;
        }
        else{
            textInputEditTextEmail.setError(null);
            textInputEditTextEmail.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String data = textInputEditTextPassword.getEditText().getText().toString();
        String passwordValidation = "(?=.*[a-zA-Z])" +      //any letter
                                    "(?=\\S+$)" +           //no white spaces
                                    ".{4,}" +               //at least 4 characters
                                    "$";

        if (data.isEmpty()){
            textInputEditTextPassword.setError("Must enter password");
            return false;
        }
        else if (!data.matches(passwordValidation)) {
            textInputEditTextPassword.setError("Password is too weak");
            return false;
        }
        else{
            textInputEditTextPassword.setError(null);
            textInputEditTextPassword.setErrorEnabled(false);
            return true;
        }
    }



    public int userRegister(View view){

        if(!validateName() | !validatePassword() | !validateEmail() | !validateUsername()){
            return 0;
        }

        String name = textInputEditTextName.getEditText().getText().toString();
        String email = textInputEditTextEmail.getEditText().getText().toString();
        String username = textInputEditTextUsername.getEditText().getText().toString();
        String password = textInputEditTextPassword.getEditText().getText().toString();

        int correct_alphabet = 0;
        int correct_animals = 0;
        int correct_numbers = 0;

        int wrong_alphabet = 0;
        int wrong_animals = 0;
        int wrong_numbers = 0;

        int timesPlayed_alphabet = 0;
        int timesPlayed_animals = 0;
        int timesPlayed_numbers = 0;

        String phone = "Please Update Phone Number";
        String address = "Please Update Address";
        String childName = "Please Update Child's Name";



        UserHelperClass helperClass = new UserHelperClass(name, email, username, password, correct_alphabet, correct_animals, correct_numbers,
                                                        wrong_alphabet, wrong_animals, wrong_numbers, timesPlayed_alphabet, timesPlayed_animals, timesPlayed_numbers, phone, address, childName);
        reference.child(username).setValue(helperClass);

        return 1;
    }


}