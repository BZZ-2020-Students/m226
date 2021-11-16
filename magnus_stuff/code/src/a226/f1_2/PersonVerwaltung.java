package a226.f1_2;

public class PersonVerwaltung {
    public static void main(String[] args) {
        new PersonVerwaltung().run();
    }

    public void run(){
        Person person = new Person("Moritz", 16);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Tim", 18, 1, 1170f, "07823451234");
        Kunde kunde = new Kunde("Marc", 16, mitarbeiter);
        Stammkunde stammkunde = new Stammkunde("Alyssa", 16, mitarbeiter, 12f);

        person.print();
        mitarbeiter.print();
        kunde.print();
        stammkunde.print();
    }
}
