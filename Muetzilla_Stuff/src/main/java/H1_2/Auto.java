package H1_2;

public class Auto {
    private String marke;
    private String kennzeichen;

    public Auto(String marke, String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }
}
