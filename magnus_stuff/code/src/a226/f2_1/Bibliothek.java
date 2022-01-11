package a226.f2_1;

import java.io.PrintStream;

public class Bibliothek {
    public int MAX_MEDIEN = 10;
    private PrintMedium[] medienListe;
    private int medienCntr;

    public Bibliothek() {
        this.medienListe = new PrintMedium[this.MAX_MEDIEN];
    }

    public int getMedienCntr() {
        return this.medienCntr;
    }

    public void addMedium(PrintMedium medium) {
        this.medienListe[this.medienCntr] = medium;
        ++this.medienCntr;
    }

    public PrintMedium getMedium(int index) {
        return this.medienListe[index];
    }

    public int getMAX_MEDIEN() {
        return this.MAX_MEDIEN;
    }

    public void printOut() {
        System.out.println("\nInventar der Bibliothek\n-----------------------");

        for(int i = 0; i < this.medienCntr; ++i) {
            System.out.println(this.medienListe[i].getVerlag() + ": " + this.medienListe[i].getTitel());
        }

    }

    public void showInventory() {
        System.out.println("Titel               Verlag              ");
        System.out.println("--------------------------------------");

        for(int i = 0; i < this.medienCntr; ++i) {
            PrintStream var10000 = System.out;
            String var10001 = this.medienListe[i].addTabulator2Text(this.medienListe[i].titel);
            var10000.println(var10001 + this.medienListe[i].addTabulator2Text(this.medienListe[i].verlag));
        }

    }
}
