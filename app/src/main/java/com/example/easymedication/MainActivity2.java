package com.example.easymedication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity2 extends AppCompatActivity {
    private TextView mainTextView;
    public ImageView backgroundImageView;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mainTextView = findViewById(R.id.textView);
        ImageView backgroundImageView = findViewById(R.id.backgroundImageView);
        Button button = findViewById(R.id.button);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        TextView.animate().alpha(0).setDuration(2000);

        mainTextView.setText(R.string.welcome);

        // Set a click listener for the Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to the second activity
                Intent intent = new Intent(MainActivity2.this, LoginActivity3.class);
                startActivity(intent);
            }
        });
    }}
