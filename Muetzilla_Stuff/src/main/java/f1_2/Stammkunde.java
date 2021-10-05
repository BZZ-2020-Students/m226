package f1_2;

public class Stammkunde extends Kunde {
    private float rabatt;

    public Stammkunde(String name, int alter, Mitarbeiter kontakt, float rabatt) {
        super(name, alter, kontakt);
        this.rabatt = rabatt;
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }

    @Override
    public void print() {
        System.out.println("Rabatt: " + rabatt);
    }
}
