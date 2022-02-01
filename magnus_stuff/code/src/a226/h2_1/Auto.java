package a226.h2_1;

public class Auto {
    public String marke;
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

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                '}';
    }
}
