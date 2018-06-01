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

public class DataSource2 {

    private SQLiteDatabase rezepte;
    private DatabaseHelper DBHelper2;
    private String[] allColumns = { "ID", "Name", "Zutaten", "Beschreibung", "Bild"};


    public DataSource2(Context context) {
        DBHelper2 = new DatabaseHelper(context);
    }

    public void open2() {
        rezepte = DBHelper2.getWritableDatabase();
    }

    public void close2(){
        DBHelper2.close();
    }

    public Entry createEntry2(int ID, String Name, String Zutaten, String Beschreibung, String Bild) {
        ContentValues values = new ContentValues();
        values.put("ID", ID);
        values.put("Name", Name);
        values.put("Zutaten" , Zutaten);
        values.put("Beschreibung", Beschreibung);
        values.put("Bild", Bild);

        long insertID = rezepte.insert("Rezepte", null, values);

        Cursor cursor = rezepte.query("Rezepte", allColumns, "ID = " + insertID, null, null, null, null);
        cursor.moveToFirst();

        return cursorToEntry(cursor);
    }

    protected List<Entry> getallEntries(){
        List<Entry> EntriesList = new ArrayList<Entry>();
        EntriesList = new ArrayList<Entry>();

        Cursor cursor = rezepte.query("Cookapp", allColumns, null, null, null, null, null);
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
        //entry.setZutaten(cursor.getString(2));

        return entry;
    }
}
