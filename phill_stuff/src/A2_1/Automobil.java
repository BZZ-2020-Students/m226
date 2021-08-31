package A2_1;

public class Automobil {
    private String automarke;
    private String typ;
    private int kontrollschild;
    private String farbe;

    public Automobil(String automarke, String typ, int kontrollschild, String farbe) {
        this.automarke = automarke;
        this.typ = typ;
        this.kontrollschild = kontrollschild;
        this.farbe = farbe;
    }

    public String getAutomarke() {
        return automarke;
    }

    public void setAutomarke(String automarke) {
        this.automarke = automarke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getKontrollschild() {
        return kontrollschild;
    }

    public void setKontrollschild(int kontrollschild) {
        this.kontrollschild = kontrollschild;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
