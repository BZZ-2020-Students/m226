package C2_2;

/**
 * Ein Punkt, welcher eine X sowie eine Y Koordinate besitzt.
 */
public class Punkt{
    /**
     * X Koordinate des Punktes
     */
    private int x; // Datenfelder für die x- und
    /**
     * Y Koordinate des Punktes
     */
    private int y; // y-Koordinate vom Typ int

    /**
     *
     * @return die X Koordinate
     */
    public int getX() // eine Methode, um den Wert
    { // von x abzuholen
        return x;
    }

    /**
     *
     * @return die Y Koordinate
     */
    public int getY() // eine Methode, um den Wert
    { // von y abzuholen
        return y;
    }

    /**
     *
     * @param i der Wert, welcher der X Koordinate zugewiesen werden soll
     */
    public void setX (int i) // eine Methode, um den Wert
    { // von x zu setzen
        x = i;
    }

    /**
     *
     * @param i der Wert, welcher der Y Koordinate zugewiesen werden soll
     */
    public void setY (int i) // eine Methode, um den Wert
    { // von y zu setzen
        y = i;
    }
    // Mit main() beginnt eine Java-Anwendung ihre Ausführung.
    public static void main (String[] args)
    {
        Punkt p = new Punkt(); // Punkt erzeugen
        p.setX (3); // Aufruf der Methode setX()
        p.setY (2); // Aufruf der Methode setY()
        System.out.println ("Die Koordinaten des Punktes sind: ");
        System.out.println (p.getX()); // Wert von x wird ausgegeben
        System.out.println (p.getY()); // Wert von y wird ausgegeben
    }
}
