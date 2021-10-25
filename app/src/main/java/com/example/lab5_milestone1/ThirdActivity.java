package com.example.lab5_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void saveMethod (View view) {
//        EditText editNotes = (EditText) findViewById(R.id.editNotes);
//        content = editNotes.getText().toString();
//
//        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.lab5_sharedpreferences", Context.MODE_PRIVATE);
//        String username = sharedPreferences.getString("username", "");
//
//        Context context = getApplicationContext();
//        SQLiteDatabase sqLiteDatabase = context.openOrCreateDatabase("notes", Context.MODE_PRIVATE, null);
//        DBHelper dbHelper = new DBHelper(sqLiteDatabase);
//
//        String title;
//        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        String date = dateFormat.format(new Date());
//
//        if (noteid == -1) {
//            title = "NOTE_" + (NotesActivity.notes.size() + 1);
//            dbHelper.saveNotes(username, title, content, date);
//        } else {
//            title = "NOTE_" + (noteid + 1);
//            dbHelper.updateNote(title, date, content, username);
//        }
//
//        Intent intent = new Intent(this, NotesActivity.class);
//        intent.putExtra("username", username);
//        startActivity(intent);
    }
}