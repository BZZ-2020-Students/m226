/**
 * Nadina Amsler (shirin197)
 * 01.11.2021
 * 01.02
 * **/

import java.awt.*;

public class Blume {
    private Wurzel wurzel;
    private Bluete[] blueten = new Bluete[7];
    private String name;

    public Blume(){
        wurzel = new Wurzel("Knollwurzel");
        blueten[0] = new Bluete(new Color(255,0,0));
        blueten[1] = new Bluete(new Color(0,0,255));
        blueten[2] = new Bluete(new Color(255,255,0));
    }

    public void  print(){
        System.out.println("- Name , " + name);
        System.out.println("- Wurzel, " + wurzel.getTyp());
        for (int i = 0; i < blueten.length; i++) {
            System.out.println("- " + (i + 1) + ".Blüte, " + blueten[i].getFarbe());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Wurzel getWurzel() {
        return wurzel;
    }

    public void setWurzel(Wurzel wurzel) {
        this.wurzel = wurzel;
    }

    public Bluete[] getBlueten() {
        return blueten;
    }

    public void setBlueten(Bluete[] blueten) {
        this.blueten = blueten;
    }
}
