package learningUnitF.F1_2;

public class PersonenVerwaltung {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Moritz", 17, 69, 4.20f, "079 het sie gseit");
        Kunde kunde = new Kunde("Tim", 18, mitarbeiter);
        Stammkunde stammkunde = new Stammkunde("Ash", 16, mitarbeiter, 0.9f);

        mitarbeiter.print();
        System.out.println();
        kunde.print();
        System.out.println();
        stammkunde.print();
    }
}