package H3_1;


import H2_1.Auto;
import H2_1.Autoliste;

public class AutoApp {

    public static void main(String[] args) {
        H2_1.Autoliste liste = new Autoliste();

        liste.addAuto(new H2_1.Auto("Toyota", "ZH 333444"));
        liste.addAuto(new H2_1.Auto("VW", "GE 111222"));
        liste.addAuto(new H2_1.Auto("Porsche", "BE 1"));
        liste.addAuto(new H2_1.Auto("Fiat", "TI 5556677"));


        liste.printList();

        liste.removeAuto(2);
        liste.printList();

        Auto a = liste.getAuto(1);
        liste.removeAuto(a);

        liste.printList();
    }

}
