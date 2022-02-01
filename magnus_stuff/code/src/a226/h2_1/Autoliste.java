package a226.h2_1;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Autoliste {

    private Vector<Auto> alleAuto;

    private Collection<Auto> a;

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

    public void printListe(){
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
}
