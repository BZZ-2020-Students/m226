package A3_5;

public class Flasche {
    private int fuellung;
    private String name;
    private int groesse;
    private boolean offen;

    public Flasche() {
    }

    public Flasche(String name, int inhalt) {
        this.name = name;
        this.setFuellung(inhalt);
    }

    public int getFuellung() {
        return this.fuellung;
    }

    public void setFuellung(int fuellung) {
        if (fuellung >= this.groesse) {
            try {
                throw new Exception("Die Füllung darf nicht grösser als die Grösse der Flasche sein");
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        } else {
            this.fuellung = fuellung;
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroesse() {
        return this.groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void oeffnen() {
        this.offen = true;
    }

    public void schliessen() {
        this.offen = false;
    }

    public boolean isOffen() {
        return this.offen;
    }
}
