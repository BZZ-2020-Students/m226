package f12;

public class PersonenVerwaltung {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new MitarbeiterAdmin("Muetz", 16, "013248921345", 690);
        Kunde kunde = new Kunde("Gian", 19, mitarbeiter);
        Stammkunde stammkunde = new Stammkunde("Hans", 42, mitarbeiter, 15);

        mitarbeiter.print();
        kunde.print();
        stammkunde.print();
    }
}
