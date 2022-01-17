package H2_1;


public class AutoApp {

    public static void main(String[] args) {
        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "ZH 333444"));
        liste.addAuto(new Auto("VW", "GE 111222"));
        liste.addAuto(new Auto("Porsche", "BE 1"));
        liste.addAuto(new Auto("Fiat", "TI 5556677"));


        liste.printList();

        liste.removeAuto(2);
        liste.printList();

        Auto a = liste.getAuto(1);
        liste.removeAuto(a);

        liste.printList();
    }

}
