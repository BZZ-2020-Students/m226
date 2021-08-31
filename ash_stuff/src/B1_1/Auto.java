package B1_1;

public class Auto {
    private String nummerSchild;
    private String marke;
    private double preis;

    public Auto() {
    }

    public Auto(String nummerSchild, String marke, double preis) {
        this.nummerSchild = nummerSchild;
        this.marke = marke;
        this.preis = preis;
    }

    public String getNummerSchild() {
        return nummerSchild;
    }

    public void setNummerSchild(String nummerSchild) {
        this.nummerSchild = nummerSchild;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
