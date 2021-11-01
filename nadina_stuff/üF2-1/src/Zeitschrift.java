/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Zeitschrift extends PrintMedium{

    private String ausgabeDatum;


    public Zeitschrift(String titel, String ausgabeDatum, String verlag){
        super(titel, verlag);
        this.ausgabeDatum = ausgabeDatum;

    }

    public String getAusgabeDatum() {
        return ausgabeDatum;
    }

    public void setAusgabeDatum(String ausgabeDatum) {
        this.ausgabeDatum = ausgabeDatum;
    }

    @Override
    public void showInfo() {

    }
}
