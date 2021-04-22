package com.example.todapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class UpdateAccount extends AppCompatActivity {


    public static EditText name;
    public static EditText user;
    public static EditText pass;
    public static EditText email;
    public static EditText address;
    public static EditText phone;
    public static EditText childName;

    Button confirm;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_account);


        confirm = findViewById(R.id.confirmChanges);
        user = findViewById(R.id.usernameEdit);
        pass = findViewById(R.id.passwordEdit);
        name = findViewById(R.id.nameEdit);
        email = findViewById(R.id.emailEdit);
        address = findViewById(R.id.addressEdit);
        phone = findViewById(R.id.phoneEdit);
        childName = findViewById(R.id.childNameEdit);


        Query getValues = ref.orderByChild("username").equalTo(Login.enteredUsername);
        getValues.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snap) {
                if (snap.exists()) {
                    name.setText(snap.child(Login.enteredUsername).child("name").getValue(String.class));
                    pass.setText(snap.child(Login.enteredUsername).child("password").getValue(String.class));
                    user.setText(snap.child(Login.enteredUsername).child("username").getValue(String.class));
                    email.setText(snap.child(Login.enteredUsername).child("email").getValue(String.class));
                    address.setText(snap.child(Login.enteredUsername).child("address").getValue(String.class));
                    phone.setText(snap.child(Login.enteredUsername).child("phone").getValue(String.class));
                    childName.setText(snap.child(Login.enteredUsername).child("childName").getValue(String.class));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDB(v);
                Toast.makeText(getApplicationContext(), "Account Info Updated", Toast.LENGTH_SHORT).show();
            }

        });
    }

    void updateDB(View v)
    {
        ref.child(Login.usernameFromDB).child("name").setValue(name.getEditableText().toString());
        ref.child(Login.usernameFromDB).child("password").setValue(pass.getEditableText().toString());
        //ref.child(Login.usernameFromDB).child("username").setValue(user.getEditableText().toString());
        ref.child(Login.usernameFromDB).child("email").setValue(email.getEditableText().toString());
        ref.child(Login.usernameFromDB).child("address").setValue(address.getEditableText().toString());
        ref.child(Login.usernameFromDB).child("phone").setValue(phone.getEditableText().toString());
        ref.child(Login.usernameFromDB).child("childName").setValue(childName.getEditableText().toString());
    }
}