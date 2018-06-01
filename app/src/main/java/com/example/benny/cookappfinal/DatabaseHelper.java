package com.example.benny.cookappfinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Benny on 13.05.2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //Zutaten
    public static final String DB_NAME = "cookapp.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_COOKAPP = "Cookapp";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_ART = "Art";
    public static final String COLUMN_IMAGE = "Bild";






    public static final String SQL_CREATE =
            "create table " + TABLE_COOKAPP + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    COLUMN_NAME + " text not null, " +
                    COLUMN_ART + " text not null, " +
                    COLUMN_IMAGE + " text);";


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
