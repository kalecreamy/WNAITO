package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {
    public static int x;
    public static int correctGuess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    }

    public void toGuess(View view) {
        EditText input = (EditText) findViewById(R.id.numberInput);
        x = (int) Double.parseDouble(input.getText().toString());
        correctGuess = (int) Math.round(Math.random() * (x - 1) + 1);

        Intent intent = new Intent(NumberActivity.this, GuessActivity.class);
        startActivity(intent);
    }
}