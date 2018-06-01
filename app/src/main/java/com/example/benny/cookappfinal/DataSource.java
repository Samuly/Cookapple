package com.example.benny.cookappfinal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benny on 13.05.2018.
 */

public class DataSource {

    private SQLiteDatabase cookapp;
    private DatabaseHelper DBHelper;
    private String[] allColumns = { "ID", "NAME", "ART"};


    public DataSource(Context context) {
        DBHelper = new DatabaseHelper(context);
    }

    public void open() {
        cookapp = DBHelper.getWritableDatabase();
    }

    public void close(){
        DBHelper.close();
    }

    public Entry createEntry(int ID, String Name, String Art) {
        ContentValues values = new ContentValues();
        values.put("ID", ID);
        values.put("Name", Name);
        values.put("Art" , Art);

        long insertID = cookapp.insert("Cookapp", null, values);

        Cursor cursor = cookapp.query("Cookapp", allColumns, "ID = " + insertID, null, null, null, null);
        cursor.moveToFirst();

        return cursorToEntry(cursor);
    }

    protected List<Entry> getallEntries(){
        List<Entry> EntriesList = new ArrayList<Entry>();
        EntriesList = new ArrayList<Entry>();

        Cursor cursor = cookapp.query("Cookapp", allColumns, null, null, null, null, null);
        cursor.moveToFirst();

        if(cursor.getCount() == 0) return EntriesList;

        while(cursor.isAfterLast() == false) {
            Entry entry = cursorToEntry(cursor);
            EntriesList.add(entry);
            cursor.moveToNext();
        }
        cursor.close();
        return EntriesList;
    }


    private Entry cursorToEntry(Cursor cursor) {
        Entry entry = new Entry();
        entry.setID(cursor.getInt(0));
        entry.setName(cursor.getString(1));
        entry.setArt(cursor.getString(2));

        return entry;
    }
}
