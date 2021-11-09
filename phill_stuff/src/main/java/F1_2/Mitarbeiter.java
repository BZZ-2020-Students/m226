package F1_2;

public class Mitarbeiter extends Person {
    private int persNr;
    private float lohn;
    private String telNr;

    public Mitarbeiter(String name, int alter, int nr, String telNr, float lohn) {
        super(name, alter);
        persNr = nr;
        this.telNr = telNr;
        this.lohn = lohn;
    }

    public int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {
        this.persNr = persNr;
    }

    public float getLohn() {
        return lohn;
    }

    public void setLohn(float lohn) {
        this.lohn = lohn;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    @Override
    public void print() {
        System.out.println("PersNr: " + persNr);
        System.out.println("Lohn: " + lohn);
        System.out.println("TelNr: " + telNr);
    }
}
