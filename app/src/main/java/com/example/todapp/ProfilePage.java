package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class ProfilePage extends AppCompatActivity {


    private TextView nameTextView, usernameTextView, emailTextView, addressTextView, phoneTextView, childTextView;
    Button updateAcct,deleteAcct, logout;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("users");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);


        nameTextView = findViewById(R.id.name_textview);
        usernameTextView = findViewById(R.id.username_textview);
        emailTextView = findViewById(R.id.email_textview);
        phoneTextView = findViewById(R.id.phoneNo);
        addressTextView = findViewById(R.id.address);
        childTextView = findViewById(R.id.childName);


        //query to get our values
        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snap) {
                if (snap.exists()) {
                    nameTextView.setText(snap.child(Login.enteredUsername).child("name").getValue(String.class));
                    usernameTextView.setText(snap.child(Login.enteredUsername).child("username").getValue(String.class));
                    emailTextView.setText(snap.child(Login.enteredUsername).child("email").getValue(String.class));
                    addressTextView.setText(snap.child(Login.enteredUsername).child("address").getValue(String.class));
                    phoneTextView.setText(snap.child(Login.enteredUsername).child("phone").getValue(String.class));
                    childTextView.setText(snap.child(Login.enteredUsername).child("childName").getValue(String.class));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


        updateAcct = findViewById(R.id.updateAccount);
        updateAcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UpdateAccount.class);
                startActivity(intent);
                finish();
            }
        });

        deleteAcct = findViewById(R.id.deleteAccount);
        deleteAcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                deleteAccount(Login.usernameFromDB);

                startActivity(intent);
                finish();
            }
        });


        logout = findViewById(R.id.Logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });



    }

    void deleteAccount(String accountInfo)
    {
        DatabaseReference acct = FirebaseDatabase.getInstance().getReference("users").child(Login.usernameFromDB);
        acct.removeValue();
        Toast.makeText(getApplicationContext(), "Account Has Been Deleted", Toast.LENGTH_SHORT).show();

    }

}