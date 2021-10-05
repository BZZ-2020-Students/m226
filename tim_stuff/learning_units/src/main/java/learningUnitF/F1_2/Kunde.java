package learningUnitF.F1_2;

public class Kunde extends Person {
    private Mitarbeiter kontakt;

    public Kunde(String name, int alter, Mitarbeiter kontakt) {
        super(name, alter);
        this.kontakt = kontakt;
    }

    public void print() {
        String string = printReturn();
        System.out.println("Kunde: \n" +
                string + "\n" +
                "Kontakt: \n" + kontakt.printReturn());
    }

    public Mitarbeiter getKontakt() {
        return kontakt;
    }

    public void setKontakt(Mitarbeiter kontakt) {
        this.kontakt = kontakt;
    }
}
