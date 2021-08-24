package üA3_5;

public class Flasche {
    private String name;
    private int groesse;
    private boolean offen;
    private int fuellung;

    public Flasche(){
        // Default constructor
    }

    public Flasche(String name, int inhalt){

    }

    public int getGroesse() {
        return groesse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFuellung(int inhalt) {
        this.fuellung = inhalt;
    }

    public int getFuellung() {
        return fuellung;
    }
    public void oeffnen(){

    }

    public boolean isOffen(){
        return offen;
    }

    public void schliessen(){

    }
}
