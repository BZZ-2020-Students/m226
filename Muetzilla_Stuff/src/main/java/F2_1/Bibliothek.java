package F2_1;

public class Bibliothek {
    public static int MAX_MEDIEN = 10;
    private PrintMedium[] medienListe = new PrintMedium[MAX_MEDIEN];
    private int medienCntr = 0;

    public Bibliothek() {
    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public void addMedium(PrintMedium medium) {
        if (medienCntr > MAX_MEDIEN) {
            medienListe[medienCntr] = medium;
        }
    }

    public PrintMedium getMedium(int index) {
        return medienListe[index];
    }

    public int getMaxMedien() {
        return MAX_MEDIEN;
    }

    public void printOut() {
        
    }
}
