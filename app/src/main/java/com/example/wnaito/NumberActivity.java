package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {
    public static int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    }

    public void toGuess(View view) {
        EditText input = (EditText) findViewById(R.id.numberInput);
        x = (int) Double.parseDouble(input.getText().toString());

        Intent intent = new Intent(NumberActivity.this, GuessActivity.class);
        startActivity(intent);
    }
}