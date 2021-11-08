import java.awt.*;

public class Blume {

    private Wurzel wurzel;
    private Bluete[] blueten = new Bluete[2];
    private String name;

    public Blume(){
        blueten[0] = new Bluete(new Color(255, 0, 0));
        this.wurzel = new Wurzel("Wurzel");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("- Name ," + getName());
        System.out.println("- Wurzel," + wurzel.getTyp());
       for (int i = 0; i < blueten.length; i++){
           System.out.println("- " + (i + 1) + ".Blüte, " + blueten[i].getFarbe());
       }
    }
}
