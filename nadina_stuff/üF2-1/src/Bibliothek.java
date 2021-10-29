/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Bibliothek {
    private static int MAX_MEDIEN = 7;
    private int medienCntr = 0;
    private PrintMedium[] medienListe = new PrintMedium[MAX_MEDIEN];

    public Bibliothek (){

    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public void addMedium(PrintMedium medium){

    }

    public PrintMedium getMedium(int index){
        return medienListe[index];
    }

    public int getMAX_Medien(){
        return MAX_MEDIEN;
    }

    public void printOut(){
        System.out.println("Inventar der Bibliothek");
        System.out.println("-----------------------");
    }
}
