package com.example.android.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the all views for further refrence
        TextView number = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView color = (TextView) findViewById(R.id.colors);
        TextView phrase = (TextView) findViewById(R.id.phrases);


        //Set OnClickListener to all the views

        //onClickListener for Numbers Activity//
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
            startActivity(numbersIntent);
            }
        });

        //onClickListener for Colors Activity//
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(colorsIntent);
            }
        });

        //onClickListener for Family Activity//
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(familyIntent);
            }
        });

        //onClickListener for Phrase Activity//
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(phraseIntent);
            }
        });
    }
    Object[] hello = new  Object[10];


}