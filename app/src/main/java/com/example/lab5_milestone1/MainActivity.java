package com.example.lab5_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText usernameTextField = (EditText) findViewById(R.id.usernameEditText);
        String usernameStr = usernameTextField.getText().toString();
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.lab5_milestone1", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", usernameStr).apply();
        goToActivity2(usernameStr);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("username", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String usernameKey = "username";
        SharedPreferences sharedPreferences = getSharedPreferences("com.example.lab5_milestone1", Context.MODE_PRIVATE);
        if(!sharedPreferences.getString(usernameKey,"").equals("")) {
            String username = sharedPreferences.getString(usernameKey, "");
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(usernameKey, username);
            startActivity(intent);
        } else {
            setContentView(R.layout.activity_main);
        }

    }
}