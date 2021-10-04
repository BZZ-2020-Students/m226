public class Flaschez {
    // Attribute
    private int fuellung;
    private String name;
    private int groesse;

    public Flaschez(){
        // Default Konstruktor
    }
    public Flaschez(String name, int inhalt){

    }

    // Methode um den Wert zu holen
    public int getFuellung() {
        return fuellung;
    }

    // Methode um den Wert von fuellung zu setzten
    public void setFuellung(int inhalt) {
        if ( inhalt < groesse) {
            fuellung = inhalt;
        }
    }

    // Methode um den Wert zu holen
    public String getName() {
        return name;
    }

    // Methode um den Wert von name zu setzten
    public void setName(String name) {
        this.name = name;
    }

    // Methode um den Wert zu holen
    public int getGroesse() {
        return groesse;
    }

    // Methode um den Wert von groesse zu setzten
    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void oeffnen(){

    }
    public boolean isOffen(){
         return true; // merken
    }

    public void schliessen(){

    }
}
