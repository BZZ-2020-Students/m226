package F2_1;

public class Bibliothek {
    public static final int MAX_MEDIEN = 10;
    private PrintMedium[] medienliste = new PrintMedium[MAX_MEDIEN];
    private int medienCntr;

    public Bibliothek() {

    }

    public void addMedium(PrintMedium medium) {
        medienliste[medienCntr] = medium;
        medienCntr++;
    }

    public PrintMedium getMedium(int index) {
        return medienliste[index];
    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public int getMAX_MEDIEN() {
        return MAX_MEDIEN;
    }

    public void printOut() {
        System.out.println("Inventar der Bibliothek");
        System.out.println("-----------------------");
        for (int i = 0; i < medienliste.length; i++) {
            if (medienliste[i] != null) {
                System.out.println("Titel: " + medienliste[i].titel);
                System.out.println("Verlag: " + medienliste[i].verlag);
            }
        }
    }
}
