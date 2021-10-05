package f1_2;

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

    protected int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {
        this.persNr = persNr;
    }

    protected float getLohn() {
        return lohn;
    }

    public void setLohn(float lohn) {
        this.lohn = lohn;
    }

    protected String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    @Override
    public void print() {
        System.out.println("PersNr: " + persNr + "\n" +
                "Telnr.:" + telNr + "\n" +
                "Lohn: " + lohn);
    }

}
