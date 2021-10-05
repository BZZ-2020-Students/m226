package learningUnitF.F1_2;

public class Stammkunde extends Kunde {
    private float rabatt;

    public Stammkunde(String name, int alter, Mitarbeiter kontakt, float rabatt) {
        super(name, alter, kontakt);
        this.rabatt = rabatt;
    }

    public void print() {
        String string = printReturn();
        System.out.println("Stammkunde: \n" +
                string + "\n" +
                "Kontakt: \n" + getKontakt().printReturn() + "\n" +
                "rabatt: " + rabatt);
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }
}
