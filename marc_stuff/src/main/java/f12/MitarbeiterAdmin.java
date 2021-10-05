package f12;

public class MitarbeiterAdmin extends Mitarbeiter{
    private int persNr;
    private float lohn;

    public MitarbeiterAdmin(String name, int alter, String telNr, float lohn) {
        super(name, alter, telNr);
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
}
