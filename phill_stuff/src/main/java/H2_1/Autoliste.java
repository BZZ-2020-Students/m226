package H2_1;

import java.util.ListIterator;
import java.util.Vector;

public class Autoliste {
    private Vector<Auto> alleAutos = new Vector<>();

    public Autoliste() {

    }

    public String getKennzeichen(int index) {
        return alleAutos.get(index).getKennzeichen();
    }

    public String getMarke(int index) {
        return alleAutos.get(index).getMarke();
    }

    public String getModel(int index) {
        return alleAutos.get(index).getModel();
    }

    public Float getLeistung(int index) {
        return alleAutos.get(index).getLeistung();
    }

    public Float getPreis(int index) {
        return alleAutos.get(index).getPreis();
    }


    public void addAuto(Auto auto) {
        alleAutos.add(auto);
    }

    public Auto getAuto(int index) {
        return alleAutos.get(index);
    }

    public void removeAuto(int index) {
        alleAutos.remove(index);
    }

    public void removeAuto(Auto auto) {
        alleAutos.remove(auto);
    }

    public int getSize() {
        return alleAutos.size();
    }

    public void print() {
        ListIterator<Auto> iterator = alleAutos.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Auto Nummer:" + iterator.nextIndex() + " " + iterator.next());
        }
    }
}
