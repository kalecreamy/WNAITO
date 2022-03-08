package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GuessActivity extends AppCompatActivity {
    public static int correctGuesses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }

    public void confirmGuess(View view) {
        EditText input = (EditText) findViewById(R.id.guessInput);
        int guessNumber = (int) Double.parseDouble(input.getText().toString());

        for (int i = 0; i < 10; i++){
            int correctGuess = (int) Math.round(Math.random() * (NumberActivity.x - 1) + 1);
            System.out.println(correctGuess);
        }

        if (guessNumber == 10) {
            TextView selvi = (TextView) findViewById(R.id.textView4);
            selvi.setText("Nice one!");
            correctGuesses++;
        }
        else {
            Intent intent = new Intent(GuessActivity.this, FinalActivity.class);
            startActivity(intent);
        }
    }
}