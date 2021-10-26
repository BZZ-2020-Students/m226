package f21;

public class Bibliothek {
    private final PrintMedium[] medienListe;
    private int medienCntr = 0;
    public static final int MAX_MEDIEN = 10;

    public Bibliothek() {
        medienListe = new PrintMedium[MAX_MEDIEN];
    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public void addMedium(PrintMedium medium) {
        medienListe[medienCntr++] = medium;
    }

    public PrintMedium getMedium(int index) {
        return medienListe[index];
    }

    public int getMAX_MEDIEN() {
        return MAX_MEDIEN;
    }

    public void printOut() {
        System.out.println("Inventar der Bibliothek");
        System.out.println("-".repeat(23));
        for (PrintMedium printMedium : medienListe) {
            if (printMedium == null) continue;
            System.out.println(printMedium.getTitel() + " " + printMedium.getVerlag());
        }
        System.out.println();
    }
}
