package a226.e2_1;

public class Rad {
    private int groesse;
    private String typ;

    public Rad() {
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void print() {
        System.out.println("Rad: Typ = " + typ + " / Grösse " + groesse + " Zoll");
    }
}
