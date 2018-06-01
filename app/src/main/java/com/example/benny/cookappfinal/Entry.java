package com.example.benny.cookappfinal;

/**
 * Created by Benny on 13.05.2018.
 */

public class Entry {

    private int ID;
    private String Name;
    private String Art;

    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getArt() {
        return Art;
    }

    public void setArt(String Art) {
        this.Art = Art;
    }

    public String toString(){
        return String.format("%d %s %s", ID, Name, Art);
    }
}
