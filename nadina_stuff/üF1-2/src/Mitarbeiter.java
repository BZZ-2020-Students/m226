/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

import java.awt.*;

public class Mitarbeiter extends Person{

    private int persNr;
    private float lohn;
    private String telNr;
    protected Person person;

    public Mitarbeiter(String name,int nr, int alter, String telNr, float lohn){
        super(name, alter);
        this.persNr = nr;
        this.lohn = lohn;
        this.telNr = telNr;
    }

    public int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {
        this.persNr = persNr;
    }

    public float getLohn() {
        return lohn;
    }

    public void setLohn(float lohn) {
        this.lohn = lohn;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Nummer: " + getPersNr() + ", Alter: " + getAlter() + ", " +
                "Telefonnmmer: " + getTelNr() + ", Lohn: " + getLohn());
    }
}
