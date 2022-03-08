package com.example.wnaito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UsernameActivity extends AppCompatActivity {
    public String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
    }

    public void toNumber(View view) {
        EditText input = (EditText) findViewById(R.id.usernameInput);
        username = input.getText().toString();
        System.out.println(username);
        Intent intent = new Intent(UsernameActivity.this, NumberActivity.class);
        startActivity(intent);
    }
}