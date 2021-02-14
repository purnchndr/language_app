package com.example.android.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void number_bar(View view) {
        Intent number = new Intent(this,Numbers.class);
        startActivity(number);
    }
    public void family_bar(View view) {
        Intent number = new Intent(this,FamilyMembers.class);
        startActivity(number);
    }
    public void phrases_bar(View view) {
        Intent number = new Intent(this,Phrases.class);
        startActivity(number);
    }
    public void color_bar(View view) {
        Intent number = new Intent(this,Colors.class);
        startActivity(number);
    }

    public void main_screen(View view) {
        setContentView(R.layout.activity_main);
    }
}