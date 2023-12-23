package com.example.zyryanova_v_15;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "userstore.db";
    private static final int SCHEMA = 1;
    static final String TABLE = "User";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the table with appropriate data types
        db.execSQL("CREATE TABLE " + TABLE + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_NAME + " TEXT NOT NULL" + ");");
        // Remove the sample insertion that was previously here
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle potential future schema changes here
    }
}