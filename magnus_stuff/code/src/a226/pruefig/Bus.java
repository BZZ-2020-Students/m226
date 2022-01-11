package a226.pruefig;

/**
 *
 * Es erstellt einen Bus der einer Tour zugeteilt werden kann.
 *
 * @version 1.0 vom 02.11.2021
 * @author Magnus G�tz
 */

public class Bus {

    private int busNummer;
    private int platzZahl;
    private Platz[] sitzplaetze;

    // Konstruktor

    /**
     * Erzeugt ein Bus-Objekt mit einer eindeutigen Busnummer und der Anzahl
     * der vef�gbare Sitzpl�tze.
     * Die Sitzpl�tze werden in einem Array ( Platz[] ) bereitgestellt, so dass
     * �ber die Methode addGast() dann die Fahrg�ste auf einen bestimmten Sitzplatz
     * zugef�gt werden k�nnen.
     */
    public Bus(int busNummer, int plaetze) {
        this.busNummer = busNummer;
        this.platzZahl = plaetze;
        sitzplaetze = new Platz[plaetze];

        for (int i = 0; i < plaetze; i++) {
            sitzplaetze[i] = new Platz(i+1);
        }
    }

    // Anfang Methoden

    /**
     * getBusNummer
     * Liest die Nummr des Busses aus.
     */
    public int getBusNummer() {
        return busNummer;
    }

    /**
     * getPlatzZahl
     * Liest die Anzahl der Pl�tze des Busses aus.
     */
    public int getPlatzZahl() {
        return platzZahl;
    }

    /**
     * addGast
     * F�gt an der Stelle platzNummer einen Fahrgast zu.
     * Wird eine falsche platzNummer angeben, gibt das Programm eine Fehlermeldung
     * aus.
     * Die Platznummer beginnt bei 1, der Array-Index bei 0. Daher muss dieser Offset
     * bei der Zuweisung ber�cksichtigt werden.
     */
    public void addGast(int platzNummer, Fahrgast gast) {
        if (platzNummer <= platzZahl) {
            platzNummer--;
            if (sitzplaetze[platzNummer].getFahrgast() == null) {
                sitzplaetze[platzNummer].setFahrgast(gast);
            }
        }
        else {
            System.out.println("Diese Platznummer ist entweder vergeben und nicht erh�ltlich");
        }
    }

    /**
     * getFahrgast;
     * Liefert die Referenz auf den Fahrgast an der Poition platzNummer.
     * Wenn an se Stelle platzNummer kein Fahrgast-Objekt voranden ist, wird
     * null zr�ckgegeben.
     * Ist der Wet von platzNummer ung�ltig, wird eine Fehlermeldung augegeben.
     * Die Platznummer beginnt bei 1, der Array-Index bei 0. Daher muss dieser Offset
     * bei der Zuweisung ber�cksichtigt werden.
     */
    public Fahrgast getFahrgast(int platzNummer){
        if (platzNummer > platzZahl){
            System.out.println("Es gibt nicht so viele Sitzplaetze");
            return null;
        }else {
            return sitzplaetze[--platzNummer].getFahrgast();
        }
    }

    /**
     * printBusInfo
     * gibt die Infos zu Bus und Passagiere aus.
     * Die Sitzplatzummerierung muss mit 1 beginnen.
     */
    public void printBusInfo() {
        System.out.println("Bus-Nummer: " + busNummer);
        System.out.println("Busbelegung:");
        for (Platz p : sitzplaetze){
            if(p.getFahrgast() != null){
                Fahrgast f = p.getFahrgast();

                System.out.println("\tPlatz " + p.getPlatzNummer() + " " + f.getFullName());
            }
        }
    }
    // Ende Methoden
} // end of Bus

