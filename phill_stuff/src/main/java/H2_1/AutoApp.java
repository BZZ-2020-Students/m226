package H2_1;

public class AutoApp {

    public static void main(String[] args) {
        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "ZH 333444"));
        liste.addAuto(new Auto("VW", "GE 111222"));
        liste.addAuto(new Auto("Porsche", "BE 1"));
        liste.addAuto(new Auto("Fiat", "TI 5556677"));

        liste.printListe();

        liste.removeAuto(2);
        liste.printListe();

        Auto a = liste.getAuto(1);
        liste.removeAuto(a);
        liste.printListe();
    }

    /*
    public static void print(Autoliste liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto Nr. " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
        System.out.println("--------------------------------------");
    }
    */
}
