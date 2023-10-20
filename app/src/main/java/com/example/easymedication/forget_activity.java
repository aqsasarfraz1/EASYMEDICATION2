package com.example.easymedication;

import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class forget_activity extends  AppCompatActivity {

    private ImageView imageViewLogo;
    private EditText editTextEmail;
    private Button buttonResetPassword;
    private TextView textViewBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        // Initialize views by their IDs
        imageViewLogo = findViewById(R.id.imageViewLogo);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonResetPassword = findViewById(R.id.buttonResetPassword);
        textViewBackToLogin = findViewById(R.id.textViewBackToLogin);

        // Set click listeners
        buttonResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = editTextEmail.getText().toString();

                // TODO: Implement your password reset logic here
                // This may involve generating a reset token, saving it to a database, and sending an email with the token.

                // Use JavaMail API or your email service library to send the password reset email
                sendPasswordResetEmail(userEmail);
            }

            private void sendPasswordResetEmail(String userEmail) {
            }

        });

        textViewBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(forget_activity.this, LoginActivity3.class);
                startActivity(intent);
            }
                });
    }}






