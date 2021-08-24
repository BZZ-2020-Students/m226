package B1_1;

public class Auto {
    private int ps;
    private String marke;

    public Auto() {
    }

    public Auto(int ps) {
        this.ps = ps;
    }

    public Auto(String marke) {
        this.marke = marke;
    }

    public Auto(int ps, String marke) {
        this.ps = ps;
        this.marke = marke;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
