package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {


    TextInputLayout textInputEditTextUsername, textInputEditTextPassword;
    Button login_button;
    TextView signupView;
    ProgressBar progessBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEditTextUsername = findViewById(R.id.loginUsername);
        textInputEditTextPassword = findViewById(R.id.loginPassword);
        login_button = findViewById(R.id.login_btn);
        signupView = findViewById(R.id.signup_text);


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin(v);
            }
        });

        signupView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
                finish();
            }
        });

    }




    private Boolean validateUsername() {
        String data = textInputEditTextUsername.getEditText().getText().toString();

        if (data.isEmpty()){
            textInputEditTextUsername.setError("Must enter username");
            return false;
        }
        else{
            textInputEditTextUsername.setError(null);
            textInputEditTextUsername.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String data = textInputEditTextPassword.getEditText().getText().toString();

        if (data.isEmpty()){
            textInputEditTextPassword.setError("Must enter password");
            return false;
        }
        else{
            textInputEditTextPassword.setError(null);
            textInputEditTextPassword.setErrorEnabled(false);
            return true;
        }
    }


    public void userLogin(View view){
        if(!validatePassword() | !validateUsername()){
            return;
        }
        else{
            isUser();
        }

    }

    private void isUser() {

        String enteredUsername = textInputEditTextUsername.getEditText().getText().toString();
        String enteredPassword = textInputEditTextPassword.getEditText().getText().toString();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");

        Query checkUser = reference.orderByChild("username").equalTo(enteredUsername);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.exists()){
                    String passwordFromDB = snapshot.child(enteredUsername).child("password").getValue(String.class);

                    if (passwordFromDB.equals(enteredPassword)){
                        textInputEditTextUsername.setError(null);
                        textInputEditTextUsername.setErrorEnabled(false);
                        String nameFromDB = snapshot.child(enteredUsername).child("name").getValue(String.class);
                        String usernameFromDB = snapshot.child(enteredUsername).child("username").getValue(String.class);
                        String emailFromDB = snapshot.child(enteredUsername).child("email").getValue(String.class);
                        Intent intent = new Intent(getApplicationContext(), Home_Screen.class);
                        intent.putExtra("name", nameFromDB);
                        intent.putExtra("username", usernameFromDB);
                        intent.putExtra("email", emailFromDB);
                        intent.putExtra("password", passwordFromDB);
                        startActivity(intent);
                    } else {
                        textInputEditTextPassword.setError("Wrong Password");
                        textInputEditTextPassword.requestFocus();
                    }
                } else {
                    textInputEditTextUsername.setError("User does not exist");
                    textInputEditTextUsername.requestFocus();
                    }


                }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

    }


}