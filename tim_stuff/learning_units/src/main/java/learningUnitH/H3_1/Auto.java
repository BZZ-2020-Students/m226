package learningUnitH.H3_1;

public class Auto implements Comparable<Auto> {

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

    @Override
    public int compareTo(Auto o) {
        return this.getKennzeichen().compareTo(o.getKennzeichen());
    }
}
