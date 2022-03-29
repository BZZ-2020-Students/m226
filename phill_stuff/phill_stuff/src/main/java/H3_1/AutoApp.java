package H3_1;

public class AutoApp {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", "M635CSI", 285f, 50000f, "LOWE24");
        Auto a2 = new Auto("BMW", "325i", 192f, 8000f, "LOWE36");
        Auto a3 = new Auto("Jaguar", "XJ6", 200f, 10000f, "THEJAG");
        Auto a4 = new Auto("Ferrari", "F40", 478f, 400000f, "F40");


        System.out.println(a1.compareTo(a2));
        Autoliste list = new Autoliste();
        list.addAuto(a1);
        list.addAuto(a2);
        list.addAuto(a3);
        list.addAuto(a4);

//        list.removeAuto(3);
//        list.removeAuto(a2);
        list.print();
        list.sortiereAuto();
        list.print();
    }

//    public static void print(Autoliste liste) {
//
//        for (int i = 0; i < liste.getSize(); i++) {
//            System.out.println("Auto " + (i + 1) + "\n-------\nMarke: " + liste.getMarke(i) + "\nModel: " + liste.getModel(i) + "\nLeistung: " + liste.getLeistung(i) + "\nPreis: " + liste.getPreis(i) + " CHF" + "\nKennzeichen: " + liste.getKennzeichen(i) + "\n");
//        }
//    }
}
