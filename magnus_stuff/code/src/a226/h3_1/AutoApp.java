package a226.h3_1;

public class AutoApp {

    public static void main(String[] args) {
        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "333444"));
        liste.addAuto(new Auto("VW", "111222"));
        liste.addAuto(new Auto("Porsche", "1"));
        liste.addAuto(new Auto("Fiat", "5556677"));
        liste.addAuto(new Auto("Mercedes", "25672"));
        liste.addAuto(new Auto("BMW", "32618"));
        liste.addAuto(new Auto("Honda", "307490"));
        liste.addAuto(new Auto("Hyundai", "45851"));
        liste.addAuto(new Auto("Volvo", "37188"));
        liste.addAuto(new Auto("Audi", "166322"));
        liste.addAuto(new Auto("Alfa Romeo", "182806"));
        liste.addAuto(new Auto("McLaren", "808522"));

        liste.sortiereAuto();
//        print(liste);
//        liste.printListe();
        liste.listIterator();

        liste.removeAuto(2);
//        print(liste);
//        liste.printListe();
        liste.listIterator();

        Auto a = liste.getAuto(1);
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
