package learningUnitA.A3_5;

public class Flasche {
    private int fuellung;
    private String name;
    private final int groesse = 500;
    private boolean offen = false;

    public Flasche() {
    }

    public Flasche(String name, int inhalt) {
        this.name = name;
        setFuellung(inhalt);
    }

    public int getFuellung() {
        return fuellung;
    }

    public void setFuellung(int fuellung) {
        if (fuellung >= groesse) {
            throw new IllegalArgumentException();
        } else {
            this.fuellung = fuellung;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroesse() {
        return groesse;
    }

    public void oeffnen() {
        offen = true;
    }

    public void schliessen() {
        offen = false;
    }

    public boolean isOffen() {
        return offen;
    }
}
