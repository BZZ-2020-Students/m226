package F1_2;

public class PersonenVerwaltung {
    public static void main(String[] args) {
        Person P1 = new Person("Robert",20);
        Mitarbeiter m1 = new Mitarbeiter("Tim",24,3,"000 000 000",3000);
        Kunde k1 = new Kunde("Fritz",6,m1);
        Stammkunde S1 = new Stammkunde("Loic", 5,m1,30);
        P1.print();
        m1.print();
        k1.print();
        S1.print();
    }
}
