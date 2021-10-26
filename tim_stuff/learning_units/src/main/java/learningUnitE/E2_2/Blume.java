package learningUnitE.E2_2;

import java.awt.*;
import java.util.Random;

public class Blume {
    private Wurzel wurzel;
    private Bluete[] blueten;
    private String name;

    public Blume() {
        blueten = new Bluete[3];
        this.wurzel = new Wurzel("WURZEL");

        Random rand = new Random();
        for(int i = 0; i < blueten.length; i++) {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            blueten[i] = new Bluete(new Color(r, g, b));
        }
    }

    public void print() {
        StringBuilder string = new StringBuilder("Blume: \t - Name: " + this.name + "\n" +
                "\t\t - Wurzel: " + this.wurzel.getTyp());

        int counter = 1;
        for (Bluete bluete : blueten) {
            string.append("\n\t\t - ").append(counter++).append(". Blüte: ").append(bluete.getFarbe());
        }

        System.out.println(string);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
