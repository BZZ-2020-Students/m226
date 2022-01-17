package A3_5;

public class Flasche {
    private int fuellung;
    private String name;
    private int groesse;
    private boolean istOffen;

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
        if (fuellung < groesse) {
            this.fuellung = fuellung;
        }else{
            System.err.println("Error. Groesse darf nicht kleiner als die Fuellung sein!");
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

    public void oeffnen(){
        istOffen = true;
    }

    public boolean isOffen() {
        return istOffen;
    }

    public void schliessen(){
        istOffen = false;
    }
}
