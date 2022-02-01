package a226.h3_1;

import java.util.Iterator;
import java.util.Vector;

public class Autoliste {

    private Vector<Auto> alleAuto;

    public Autoliste() {
        this.alleAuto = new Vector<>();
    }

    public String getKennzeichen(int index) {
        return alleAuto.get(index).getKennzeichen();
    }

    public String getMarke(int index) {
        return alleAuto.get(index).getMarke();
    }

    public void addAuto(Auto auto) {
        alleAuto.add(auto);
    }

    public Auto getAuto(int index) {
        return alleAuto.get(index);
    }

    public void removeAuto(int index) {
        alleAuto.remove(index);
    }

    public void removeAuto(Auto auto) {
        alleAuto.remove(auto);
    }

    public int getSize() {
        return alleAuto.size();
    }

    public void printListe() {
        int c = 0;
        for (Auto auto : alleAuto) {
            c++;
            System.out.println("Auto Nr. " + c + ": " + auto.getKennzeichen() + " - " + auto.getMarke());
        }
        System.out.println("--------------------------------------");
    }

    public void listIterator() {
        Iterator<Auto> iterator = alleAuto.iterator();
        int c = 0;
        while (iterator.hasNext()) {
            c++;
            Auto a = iterator.next();
            System.out.println("Auto Nr. " + c + ": " + a.getKennzeichen() + " - " + a.getMarke());
        }
        System.out.println("--------------------------------------");
    }

    public void sortiereAuto() {
        int n = alleAuto.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (alleAuto.get(j-1).compareTo(alleAuto.get(j))) {
                    Auto temp = alleAuto.get(j-1);
                    alleAuto.set(j-1, alleAuto.get(j));
                    alleAuto.set(j, temp);
                }

            }
        }
    }
}
