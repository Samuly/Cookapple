package com.example.benny.cookappfinal;

/**
 * Created by Benny on 13.05.2018.
 */

public class Entry2 {

    private int ID2;
    private String Name2;
    private String Zutaten;
    private String Beschreibung;
    private String Bild;

    public int getID2(){
        return ID2;
    }

    public void setID2(int ID2) {
        this.ID2 = ID2;
    }

    public String getName2() {
        return Name2;
    }

    public void setName2(String Name2) {
        this.Name2 = Name2;
    }

    public String getZutaten() {
        return Zutaten;
    }

    public void setZutaten(String Zutaten) {
        this.Zutaten = Zutaten;
    }

    public String getBeschreibung(){
        return Beschreibung;
    }

    public void setBeschreibung(String Beschreibung){
        this.Beschreibung = Beschreibung;
    }

    public String getBild() {
        return Bild;
    }

    public void setBild(String Bild){
        this.Bild = Bild;
    }



    public String toString(){
        return String.format("%d %s %s %s %s", ID2, Name2, Zutaten, Beschreibung, Bild);
    }
}
