package H1_2;

import java.util.ArrayList;

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

}
