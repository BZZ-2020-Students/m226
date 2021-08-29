package a226;

public class Flasche {
    private int fuellung;
    private String name;
    private int groesse;
    private boolean offen;

    public Flasche() {
    }

    public Flasche(int inhalt, String name) {
        if (inhalt < groesse)
            this.fuellung = inhalt;
        this.name = name;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getFuellung() {
        return fuellung;
    }

    public void setFuellung(int inhalt) {
        if (inhalt < groesse)
            this.fuellung = inhalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void oeffnen() {
        offen = true;
    }

    public boolean isOffen() {
        return offen;
    }

    public void schliessen() {
        offen = false;
    }
}
