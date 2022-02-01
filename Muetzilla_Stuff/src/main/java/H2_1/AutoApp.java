package H2_1;

public class AutoApp {
    public static void main(String[] args) {
        Autoliste al = new Autoliste();
        Auto bmw = new Auto("BMW", "AG-333444");
        al.addAuto(new Auto("Porsche", "ZH-111222"));
        al.addAuto(bmw);
        al.addAuto(new Auto("Audi", "BE-555666"));
        al.addAuto(new Auto("VW", "GE-777888"));
        al.addAuto(new Auto("VW", "OW-773991"));
        al.addAuto(new Auto("VW", "NE-917016"));
        al.addAuto(new Auto("VW", "GR-710711"));
        al.addAuto(new Auto("VW", "BL-661082"));
        al.addAuto(new Auto("VW", "BS-992759"));
        al.addAuto(new Auto("VW", "AI-125170"));
        al.addAuto(new Auto("VW", "TI-998152"));
        al.addAuto(new Auto("VW", "SZ-109616"));
        //print(al);
        al.printListe();
        System.out.println("----------------------------");
        al.removeAuto(2);
        //print(al);
        al.printListe();
        System.out.println("----------------------------");
        al.removeAuto(bmw);
        al.printListe();
        // print(al);
        al.sortierenAutos();
        System.out.println("----------------------------");
        al.printListe();
    }

    /*
    public static void print(Autoliste liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
    }
     */

}
