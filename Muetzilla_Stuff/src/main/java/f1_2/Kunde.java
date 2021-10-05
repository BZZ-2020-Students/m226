package f1_2;

public class Kunde extends Person {
    protected Mitarbeiter kontakt;

    public Kunde(String name, int alter, Mitarbeiter kontakt) {
        super(name, alter);
        this.kontakt = kontakt;
    }

    public Mitarbeiter getKontakt() {
        return kontakt;
    }

    public void setKontakt(Mitarbeiter kontakt) {
        this.kontakt = kontakt;
    }

    @Override
    public void print() {
        System.out.println("Kontakt: " + kontakt.getName());
    }
}
