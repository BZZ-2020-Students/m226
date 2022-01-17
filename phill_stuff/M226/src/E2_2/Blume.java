package E2_2;

import java.awt.*;

public class Blume {
    private Wurzel wurzel;
    private Bluete[] blueten = new Bluete[3];
    private String name;

    public Blume() {
        wurzel = new Wurzel("Tiefwurzel");

        for (int i = 0; i < blueten.length; i++){
            blueten[i] = new Bluete(new Color(i+100,255,255));
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
            System.out.println("       - "+(i+1)+". Bl?te, java.awt.Color"+blueten[i].getFarbe());
    }
}
