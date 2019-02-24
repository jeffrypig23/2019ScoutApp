package com.example.mikal.scout2019.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;


public class DbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Scoutdb.db";
    public static final int VERSION_NUMBER = 1;
    public static final String COL1 = "ID";
    public static final String COL2 = "name";

    private static final String TAG = "DatabaseHelper";


    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ItemsTable.SQL_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ItemsTable.SQL_DELETE);
        onCreate(db);
    }

    public boolean addData(String item) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item);
        Log.d(TAG, "addData: " + item + " to " + DATABASE_NAME);

        long result = db.insert(DATABASE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

}
