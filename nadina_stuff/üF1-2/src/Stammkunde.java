/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Stammkunde extends Kunde{

    private float rabatt;

    Stammkunde(String name, int alter, Mitarbeiter kontakt, float rabatt){
        super(name, alter, kontakt);
        this.kontakt = kontakt;
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Kontakt: " + getKontakt() + ", Rabatt: " + getRabatt());
    }
}
