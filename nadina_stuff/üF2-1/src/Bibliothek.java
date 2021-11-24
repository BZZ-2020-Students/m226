/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Bibliothek {
    private static int MAX_MEDIEN = 7;
    private int medienCntr;
    private PrintMedium[] medienListe = new PrintMedium[MAX_MEDIEN];

    public Bibliothek (){

    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public void addMedium(PrintMedium medium){
        medienListe[medienCntr] = medium;
        medienCntr++;

    }

    public PrintMedium getMedium(int index){
        return medienListe[index];
    }

    public int getMAX_Medien(){
        return MAX_MEDIEN;
    }

    public void printOut() {
        System.out.println("Bibliothek");
        System.out.println("-------------");
        for (int i = 0; i < medienListe.length; i++) {
            if(medienListe[i] != null){
                System.out.println(medienListe[i].getTitel());
                System.out.println(medienListe[i].verlag);
            }
        }
        System.out.println();
    }

    public void showInventory(){
        System.out.println("Titel                   Verlag                      ISBN-Nummer             Autor               Ausgabedatum");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for( int i = 0; i < medienCntr; i++){
            this.getMedium(i).showInfo();;
        }
    }
}
