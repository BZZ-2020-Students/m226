package H1_2;

public class AutoApp {
    public static void main(String[] args) {
        Autoliste al = new Autoliste();
        Auto bmw = new Auto("BMW", "AG-333444");
        al.addAuto(new Auto("Porsche", "ZH-111222"));
        al.addAuto(bmw);
        al.addAuto(new Auto("Audi", "BE-555666"));
        al.addAuto(new Auto("VW", "GE-777888"));
        print(al);
        System.out.println("----------------------------");
        al.removeAuto(2);
        print(al);
        System.out.println("----------------------------");
        al.removeAuto(bmw);
        print(al);
    }

    public static void print(Autoliste liste) {

        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
    }
}
