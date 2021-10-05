package learningUnitF.F1_2;

public class Mitarbeiter extends Person {
    private int persNr;
    private float lohn;
    private String telNr;

    public Mitarbeiter(String name, int alter, int persNr, float lohn, String telNr) {
        super(name, alter);
        this.persNr = persNr;
        this.lohn = lohn;
        this.telNr = telNr;
    }

    public void print() {
        String string = printReturn();
        System.out.println("Mitarbeiter: \n" +
                string + "\n" +
                "persNr: " + persNr + "\n" +
                "lohn: " + lohn + "\n" +
                "telNr: " + telNr);
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
}
