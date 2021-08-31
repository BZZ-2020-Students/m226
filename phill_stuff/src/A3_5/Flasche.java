package A3_5;

import java.io.OutputStream;

public class Flasche {
    private int fuellung;
    private String name;
    private int groesse;

    public Flasche() {
    }

    public Flasche(int inhalt, String name) {
        this.name = name;
    }

    public void oeffnen(){

    }

    public boolean isOffen(){
        return false;
    }

    public void schliessen(){

    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuellung() {
        return fuellung;
    }

    public void setFuellung(int inhalt) {
        if (inhalt < groesse){
            fuellung = inhalt;
        }else{
            System.out.println("Diw Fühlung kann nicht grösser sein wie die grösse");
        }

    }
}
