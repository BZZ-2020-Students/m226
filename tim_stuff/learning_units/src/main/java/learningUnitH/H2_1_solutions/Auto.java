package learningUnitH.H2_1_solutions;

public class Auto {

    private String marke;
    private String kennzeichen;

    public Auto(String marke, String kennzeichen) {
        this.marke = marke;
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String toString() {
        return (kennzeichen + " - " + marke);
    }
}
