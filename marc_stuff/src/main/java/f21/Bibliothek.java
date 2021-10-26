package f21;

import static f21.PrintMedium.addTab2Text;

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

    public void showInventory() {
        System.out.println(addTab2Text("Titel") + addTab2Text("Verlag") + addTab2Text("ISBN-Nummer") + addTab2Text("Autor") + addTab2Text("Ausgabedatum"));
        System.out.println("-".repeat(30 * 5));
        for (PrintMedium printMedium : medienListe) {
            if (printMedium == null) continue;
            printMedium.showInfo();
        }
    }
}
