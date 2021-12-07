package H1_2;

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


}
