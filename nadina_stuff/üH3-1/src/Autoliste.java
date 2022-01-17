import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class Autoliste {

    public Vector<Auto> alleAuto;

    public Autoliste(){
        this.alleAuto = new Vector<>(); // merken
    }

    public String getKennzeichen(int index){
        return alleAuto.get(index).getKennzeichen();
    }

    public String getMarke(int index){
        return alleAuto.get(index).getMarke();
    }

    public void addAuto(Auto auto){
        alleAuto.add(auto);
    }

    public String getFarbe(int index){
        return  alleAuto.get(index).getFarbe();
    }

    public Auto getAuto(int index){
        return alleAuto.get(index);
    }

    public void removeAuto(int index){
        alleAuto.remove(index);
    }

    public void removeAuto(Auto auto){
        alleAuto.remove(auto);
    }

    public int getSize(){
        return alleAuto.size();
    }

    public void printListe() {
        ListIterator<Auto> i = alleAuto.listIterator();
        while (i.hasNext()) { // hasNext wie Scanner, schaut ob es ein nächstes Element
            System.out.println("Auto: " + i.nextIndex() + ": " + i.next());
        }
        System.out.println("--------------------------------------");
    }

    public void sortiereAuto() {
        Collections.sort(alleAuto);
    }
}
