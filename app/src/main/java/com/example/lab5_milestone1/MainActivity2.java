package com.example.lab5_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("username");
        textView2.setText("Welcome " + str +"!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.logOutItem) {
            Intent intent = new Intent(this, MainActivity.class);
            SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.lab5_milestone1", Context.MODE_PRIVATE);
            sharedPreferences.edit().remove("username").apply();
            startActivity(intent);
            return true;
        }
        return false;
    }

//    public void goToMain() {
//        Intent intent = new Intent(this, MainActivity.class);
//        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.lab5_milestone1", Context.MODE_PRIVATE);
////        sharedPreferences.edit().remove("username").apply();
//        startActivity(intent);
//    }

}