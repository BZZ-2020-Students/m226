/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */
public class PersonenVerwaltung {
    public static void main(String[] args) {

        Person person = new Person("Moritz", 16);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Thurika", 1,17, "044 324 83 94", 1000);
        Kunde kunde = new Kunde("Alice", 17, mitarbeiter);

        person.print();
        mitarbeiter.print();
        kunde.print();

    }
}
