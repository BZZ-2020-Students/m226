import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> liste = new HashMap<>();
        liste.put("Nadina", "Schauspieler");
        liste.put("Moritz", "Informatiker");
        liste.put("Thurika", "Lehrer");

        System.out.println("Die Methode get()");
        System.out.println(liste.get("Thurika"));

        System.out.println("Ganze Liste");
        System.out.println("-----------");
        Set<String> namen = liste.keySet();
        for (String name : namen){
            System.out.println("Der Beruf von " + name + ": "  + liste.get(name));
        }
    }
}


