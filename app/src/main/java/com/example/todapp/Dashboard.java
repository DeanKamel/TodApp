package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    private Button loginPage, signupPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        loginPage = (Button) findViewById(R.id.login);
        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPageRedirect();
            }
        });

        signupPage = (Button) findViewById(R.id.create_account);
        signupPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signupPageRedirect();
            }
        });

    }

    public void loginPageRedirect() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void signupPageRedirect() {
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }

}

