/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.11.2021
 * @author Nadina Amsler (shirin197)
 */

public class Platz{
    private int PlatzNummer;
    private Fahrgast fahrgast;

    public Platz(){

    }

    public Fahrgast getFahrgast() {
        return fahrgast;
    }

    public void setFahrgast(Fahrgast fahrgast) {
        this.fahrgast = fahrgast;
    }

    public int getPlatzNummer() {
        return PlatzNummer;
    }
} // end of Platz

