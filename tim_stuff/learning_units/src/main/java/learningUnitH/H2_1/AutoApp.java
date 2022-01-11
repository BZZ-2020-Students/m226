package learningUnitH.H2_1;

import java.util.Iterator;

public class AutoApp {

    public static void main(String[] args) {
        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "ZH 333444"));
        liste.addAuto(new Auto("VW", "GE 111222"));
        liste.addAuto(new Auto("Porsche", "BE 1"));
        liste.addAuto(new Auto("Fiat", "TI 5556677"));

        print(liste);

        liste.removeAuto(2);
        print(liste);

        Auto a = liste.getAuto(1);
        liste.removeAuto(a);
        print(liste);
    }

    public static void print(Autoliste liste) {
        Iterator<Auto> iter = liste.getAlleAuto().iterator();
        Auto auto;
        int counter = 0;
        while (iter.hasNext()) {
            auto = iter.next();
            System.out.println("Auto Nr. " + counter++ + ": " + auto.getKennzeichen() + " - " + auto.getMarke());
        }
        System.out.println("--------------------------------------");
    }
}
