package E2_1;

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

    public String getType() {
        return typ;
    }

    public void setType(String typ) {
        this.typ = typ;
    }

    public void print(){
        System.out.println("Rad: Typ = " + typ + " / Grösse " + groesse + " Zoll");
    }
}
