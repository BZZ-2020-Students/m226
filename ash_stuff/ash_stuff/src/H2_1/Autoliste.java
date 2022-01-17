package H2_1;;

import java.util.ListIterator;
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

    public void printList(){
        ListIterator<Auto> itList = alleAuto.listIterator();
        while(itList.hasNext()){
            Auto currentObj = itList.next();
            System.out.println("Auto Nr." +itList.nextIndex() +": "+ currentObj.getKennzeichen()+", "+ currentObj.getMarke());
        }
        System.out.println("--------------------------------------");
    }
}
