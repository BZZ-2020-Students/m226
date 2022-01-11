package H2_1;

public class Auto {
    private String marke;
    private String model;

    private Float leistung;
    private Float preis;
    private String kennzeichen;

    public Auto(String marke, String model, Float leistung, Float preis, String kennzeichen) {
        this.marke = marke;
        this.model = model;
        this.leistung = leistung;
        this.preis = preis;
        this.kennzeichen = kennzeichen;

    }

    public String getMarke() {
        return marke;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getModel() {
        return model;
    }

    public Float getLeistung() {
        return leistung;
    }

    public Float getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return (marke + " " + model + " " + leistung + " " + preis + " " + kennzeichen);
    }

}
