package a226.h2_1;

public class AutoApp {

    public static void main(String[] args) {
        Auto a = new Auto("","");
        Auto b = new Auto("","");


        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "ZH 333444"));
        liste.addAuto(new Auto("VW", "GE 111222"));
        liste.addAuto(new Auto("Porsche", "BE 1"));
        liste.addAuto(new Auto("Fiat", "TI 5556677"));

//        print(liste);
//        liste.printListe();
        liste.listIterator();

        liste.removeAuto(2);
//        print(liste);
//        liste.printListe();
        liste.listIterator();

        Auto a1 = liste.getAuto(1);
        liste.removeAuto(a);
//        print(liste);
//        liste.printListe();
        liste.listIterator();
    }

    /* dann folgt aller Code, der nicht mehr benutzt wird */
    /*public static void print(Autoliste liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto Nr. " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
        System.out.println("--------------------------------------");
    }*/
}
