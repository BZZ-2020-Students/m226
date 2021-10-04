package a226.e2_2;

import a226.e2_2.Bluete;

import java.awt.*;

public class Blume {
    private Wurzel wurzel;
    private Bluete[] blueten = new Bluete[3];
    private String name;

    public Blume() {
        wurzel = new Wurzel("wurzel");

        for (int i = 0; i < blueten.length; i++){
            blueten[i] = new Bluete(new Color(i+245,0,0));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Blume: - Name, "+name);
        System.out.println("       - Wurzel, "+wurzel.getTyp());
        for (int i = 0; i < blueten.length; i++)
            System.out.println("       - "+(i+1)+". Blüte, java.awt.Color"+blueten[i].getFarbe());
    }
}
