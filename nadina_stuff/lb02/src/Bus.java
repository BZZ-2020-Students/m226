/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.11.2021
 * @author Nadina Amsler (shirin197
 */

public class Bus{

    // Attribute
    private int busnNummer;
    private int platzZahl;
    private Platz[] sitzplaetze = new Platz[15];

    //Konstruktor
    public Bus(int busnNummer, int plaetze) {
        sitzplaetze = new Platz[sitzplaetze.length];

    }

    public int getBusnNummer() {
        return busnNummer;
    }

    public int getPlatzZahl() {
        return platzZahl;
    }

    public int getFahrgast(int platzNummer) {
        return platzNummer;
    }

    public Fahrgast setFahrgast(Fahrgast fahrgast){
        return fahrgast;
    }

    public void addGast(int platzNummer, Fahrgast fahrgast) {
        for (int i = 0; i < sitzplaetze.length; i++) {
            System.out.println("Platz, " + (i + 1) + sitzplaetze[i].getFahrgast());
            System.out.println(" " + fahrgast);
        }
            if(platzNummer == Integer.parseInt(null)){
                System.out.println("Ungültige Nummer");
            }
    }

    public void printBusInfo(){

            System.out.println("Bus-Nummer: " + getBusnNummer());

    }
}

