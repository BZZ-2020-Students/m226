package a226.h1_2;

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
}
