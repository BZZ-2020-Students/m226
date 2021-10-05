package f1_2;

public class PersonenVerwaltung {
    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter("Hans", 30, 9871, "123 456 78 90", 900.50f);
        Kunde k = new Kunde("Walter", 26, m);
        Stammkunde sk = new Stammkunde("Ueli", 60, m, 20);
        System.out.println("Mitarbieter:");
        m.print();
        System.out.println("Kunde:");
        k.print();
        System.out.println("Stammkunde:");
        sk.print();

    }
}
