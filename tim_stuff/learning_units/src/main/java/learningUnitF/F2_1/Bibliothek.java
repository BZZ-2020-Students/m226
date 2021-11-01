package learningUnitF.F2_1;

public class Bibliothek {
    public final int MAX_MEDIAN = 10;
    private int medienCntr = 0;
    private PrintMedium[] medienListe = new PrintMedium[MAX_MEDIAN];

    public Bibliothek() {
    }

    public PrintMedium getMedium(int index) {
        return medienListe[index];
    }

    public PrintMedium[] getMedienListe() {
        return medienListe;
    }

    public void addMedium(PrintMedium medium) {
        medienListe[medienCntr++] = medium;
    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public int getMAX_MEDIAN() {
        return MAX_MEDIAN;
    }

    public void printOut() {
        System.out.println("Medien:");
        System.out.println(" Vorhandene Medien: " + medienCntr + " {");
        for (int i = 0; i < medienCntr; i++) {
            System.out.println("\t " + (i + 1) + ": {");
            System.out.println("\t\t Titel: " + medienListe[i].getTitel());
            System.out.println("\t\t Verlag: " + medienListe[i].getVerlag());
            System.out.println("\t }");
        }
        System.out.println(" }");
    }
}
