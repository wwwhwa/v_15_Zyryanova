package com.example.zyryanova_v_15;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class PersonalArea extends AppCompatActivity {
    TextView textView;
    DatabaseHelper databaseHelper;
    SQLiteDatabase db;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

        textView = findViewById(R.id.textname);
        databaseHelper = new DatabaseHelper(this);
        db = databaseHelper.getReadableDatabase();

        Cursor cursor = db.query(DatabaseHelper.TABLE, null, null, null, null, null, null);
        if (cursor.moveToLast()) {
            @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME));
            textView.setText(String.format(name));
        }

        cursor.close();
        db.close();
    }
    public void exit(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void notification(View view){
        Intent i = new Intent(this, Notice.class);
        startActivity(i);
    }
    public void web(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.invitro.ru"));
        startActivity(i);
    }
}