package H2_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Autoliste {
    private ArrayList<Auto> alleAuto = new ArrayList<>();

    public Autoliste() {

    }

    public String getKennzeichen(int index) {
        return alleAuto.get(index).getKennzeichen();
    }

    public String getMarke(int index) {
        return alleAuto.get(index).getMarke();
    }

    public void addAuto(Auto a) {
        alleAuto.add(a);
    }

    public Auto getAuto(int index) {
        return alleAuto.get(index);
    }

    public void removeAuto(int index) {
        alleAuto.remove(index);
    }

    public void removeAuto(Auto a) {
        alleAuto.remove(a);
    }

    public int getSize() {
        return alleAuto.size();
    }

    /*
    public void printListe() {
        for (Auto a : alleAuto) {
            System.out.println("Kennzeichen: " + a.getKennzeichen() + " Marke: " + a.getMarke());
        }
    }
     */
    public void printListe() {
        Iterator listIterator = alleAuto.listIterator();
        int coutner = 0;
        while (listIterator.hasNext()) {
            coutner++;
            System.out.println("Auto " + coutner + " :" + listIterator.next().toString());
        }
    }
    /*
        Erkenntnis:
        In einer For Each Schleife wird jeder Eintrag der Collection ausgelesen, bei einer Iteration wird eine while schleife genutzt, um dieses Ergebnis zu erzielen. ausserdem wird mittels einer Methode der Wert aus der Collection ausgelsen.

        Unterschied nach überschriebeneer ToString Methode:
        Es wird nicht die Referenz auf den Speicher ausgegeben sonder das in der überschriebenen Methode definierte.
     */

    public void sortierenAutos() {
        for (int i = 0; i < alleAuto.size(); i++) {
            if (i < alleAuto.size() - 1) {
                alleAuto.get(i).compareTo(alleAuto.get(i + 1));
            }
        }
    }
}
