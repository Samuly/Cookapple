package com.example.benny.cookappfinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Benny on 13.05.2018.
 */

public class DatabaseHelper2 extends SQLiteOpenHelper {

    //Rezepte
    public static final String DB_Name1 = "rezepte.db";
    public static final int DB_VERSION1 = 1;
    public static final String TABLE_REZEPTE = "Rezepte";
    public static final String COL_ID = "ID";
    public static final String COL_NAME = "Name";
    public static final String COL_ZUTATEN = "Zutaten";
    public static final String COL_BESCHREIBUNG = "Beschreibung";
    public static final String COL_BILD = "Bild";


    public static final String SQL_CREATE =
            "create table " + TABLE_REZEPTE + "(" +
                    COL_ID + " integer primary key autoincrement, " +
                    COL_NAME + " text not null, " +
                    COL_ZUTATEN + " text not null, " +
                    COL_BESCHREIBUNG + " text not null, " +
                    COL_BILD + " text);";




    public DatabaseHelper2(Context context) {
        super(context, DB_Name1, null, DB_VERSION1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
