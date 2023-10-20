package com.example.easymedication;


// SignupActivity.java

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class SignupActivity3 extends AppCompatActivity {

    public Button googleSignupButton;
    private TextView loginInsteadTextView,SignUpTextView;
    private EditText usernameEditText,emailEditText,passwordEditText;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3);

        googleSignupButton = findViewById(R.id.googleSignupButton);
        loginInsteadTextView = findViewById(R.id.loginInsteadTextView1);
        usernameEditText= findViewById(R.id.usernameEditText);

        emailEditText=findViewById(R.id.emailEditText1);
        SignUpTextView=findViewById(R.id.SignupTextView1);
        passwordEditText=findViewById(R.id.passwordEditText);

        googleSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                // Handle Google signup button click
                // Implement Google sign-up logic
            }
        });


        loginInsteadTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        SignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle login button click
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String email=emailEditText.getText().toString();
                // Perform login validation and API calls
            }
        });


        // ... other initialization and logic
    }

    // ... other methods
}
