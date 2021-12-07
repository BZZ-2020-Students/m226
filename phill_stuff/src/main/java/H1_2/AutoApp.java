package H1_2;

public class AutoApp {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", "M635CSIE24");
        Auto a2 = new Auto("BMW", "325iE36");
        Auto a3 = new Auto("Jaguar", "XJ6");
        Auto a4 = new Auto("Ferrari", "F40");
        Autoliste list = new Autoliste();
        list.addAuto(a1);
        list.addAuto(a2);
        list.addAuto(a3);
        list.addAuto(a4);
        list.removeAuto(3);
        list.removeAuto(a2);
        print(list);
    }

    public static void print(Autoliste liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto " + i + " Marke: " + liste.getMarke(i) + " Kennzeichen: " + liste.getKennzeichen(i));
        }
    }
}
