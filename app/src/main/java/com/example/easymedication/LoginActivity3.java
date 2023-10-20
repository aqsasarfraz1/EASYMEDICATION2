package com.example.easymedication;

// LoginActivity.java

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity3 extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;
    private TextView forgotPasswordTextView, signUpTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        forgotPasswordTextView = findViewById(R.id.haventSignupyetTextView);
        signUpTextView = findViewById(R.id.forgottenpassword);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle login button click
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                // Perform login validation and API calls
            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity3.this, forget_activity.class);
                startActivity(intent);

            }
        });

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignupActivity3();
                // Handle "Haven't Signed Up Yet?" click
                // For example, open a sign-up activity/fragment
            }
        });
    }

        public void openSignupActivity3() {
            Intent intent = new Intent(this, SignupActivity3.class);
            startActivity(intent);
        }
// ... other initialization and logic


        // ... other methods
}
