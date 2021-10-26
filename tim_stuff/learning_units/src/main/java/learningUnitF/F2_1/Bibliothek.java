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
        System.out.println(" Vorhandene Medien: " + medienListe.length + " {");
        int counter = 1;
        for (PrintMedium medium : medienListe) {
            System.out.println("\t " + counter);
            System.out.println("\t\t Titel: " + medium.getTitel());
            System.out.println("\t\t Verlag: " + medium.getTitel());

            counter++;
        }
        System.out.println(" }");
    }
}
