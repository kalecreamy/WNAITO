package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void toHome(View view) {
        Intent intent = new Intent(FinalActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void toGuess(View view) {
        Intent intent = new Intent(FinalActivity.this, GuessActivity.class);
        startActivity(intent);
    }
}