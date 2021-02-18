package com.example.android.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Button button = findViewById(R.id.homeButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent home = new Intent(Numbers.this,MainActivity.class);
             startActivity(home);
            }
        });
    }
    }