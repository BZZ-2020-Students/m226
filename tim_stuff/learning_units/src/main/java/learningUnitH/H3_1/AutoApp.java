package learningUnitH.H3_1;

public class AutoApp {

    public static void main(String[] args) {
        Autoliste liste = new Autoliste();

        liste.addAuto(new Auto("Toyota", "ZH 333444"));
        liste.addAuto(new Auto("VW", "GE 111222"));
        liste.addAuto(new Auto("Porsche", "BE 1"));
        liste.addAuto(new Auto("Fiat", "ZH 1232112"));
        liste.addAuto(new Auto("Jochen", "TI 5556677"));
        liste.addAuto(new Auto("Albert", "TI 1231234"));
        liste.addAuto(new Auto("Dings", "CH 77773"));
        liste.addAuto(new Auto("AberHallo", "HOI 1111111"));

        System.out.println("unsortiert");
        liste.printListe();

        liste.sortiereAuto();
        System.out.println("sortiert");
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
