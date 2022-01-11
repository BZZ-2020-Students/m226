package a226.pruefig;

/**
 *
 * In dieser Klasse werden die Sitzplaetze vom Bus erstellt
 *
 * @version 1.0 vom 02.11.2021
 * @author Magnus Götz
 */

public class Platz {
    private int platzNummer;
    private Fahrgast fahrgast;

    /**
     * Die Klasse erzeugen
     * @param nummer Sitzplatznummer vergeben
     */
    public Platz(int nummer){
        this.platzNummer = nummer;
    };

    /**
     * Sitzplatznummer zurueck geben
     * @return
     */
    public int getPlatzNummer(){
        return platzNummer;
    }

    /**
     * Fahrgast referenzieren
     * @param fahrgast
     */
    public void setFahrgast(Fahrgast fahrgast){
        this.fahrgast = fahrgast;
        fahrgast.setBusPlatz(this);
    }

    /**
     * referenzierter Fahrgast zurueck geben
     * @return
     */
    public Fahrgast getFahrgast(){
        return fahrgast;
    }
}

