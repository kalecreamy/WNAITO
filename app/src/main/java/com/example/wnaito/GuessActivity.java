package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GuessActivity extends AppCompatActivity {
    public static int correctGuesses = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }

    public void confirmGuess(View view) {
        EditText input = (EditText) findViewById(R.id.guessInput);
        int guessNumber = Integer.parseInt((input.getText().toString()));

        if (guessNumber == NumberActivity.correctGuess) {
            TextView text = (TextView) findViewById(R.id.textView4);
            correctGuesses++;

            String msg1 = "Nice one, you guessed correctly " + correctGuesses + "  x. Now Guess Again!";
            text.setText(msg1);
        }
        else {
            Intent intent = new Intent(GuessActivity.this, FinalActivity.class);
            startActivity(intent);
        }
    }
}