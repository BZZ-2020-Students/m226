package E2_2;

import java.awt.*;

public class Blume {
    private Wurzel wurzel;
    private Bluete[] blueten = new Bluete[3];
    private String name;

    public Blume(){
        wurzel = new Wurzel("Tiefwurzel");
        blueten[0] = new Bluete(new Color(255,0,0));
        blueten[1] = new Bluete(new Color(0,0,255));
        blueten[2] = new Bluete(new Color(0,255,0));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Blume: - Name" + name + "\n" +
                "\t - Wurzel, " + wurzel.getTyp());
        for (int i = 0; i < blueten.length; i++) {
            System.out.println("\t - " + (i + 1)  +". Blüte, " + blueten[i].getFarbe());
        }
    }
}
