package learningUnitA.A3_4;

// Datei: Punkt.java
// Deklaration der Klasse Punkt. Dem Compiler wird gesagt, dass es
// eine Klasse Punkt gibt.
public class Punkt {
    private int x; // Datenfelder für die x- und
    private int y; // y-Koordinate vom Typ int

    // eine Methode, um den Wert
    public int getX() { // von x abzuholen
        return x;
    }

    // eine Methode, um den Wert
    public int getY() { // von y abzuholen
        return y;
    }

    // eine Methode, um den Wert
    public void setX(int i) { // von x zu setzen
        x = i;
    }

    // eine Methode, um den Wert
    public void setY(int i) { // von y zu setzen
        y = i;
    }

    // Mit main() beginnt eine Java-Anwendung ihre Ausführung.
    public static void main(String[] args) {
        Punkt p = new Punkt(); // Punkt erzeugen
        p.setX(3); // Aufruf der Methode setX()
        p.setY(2); // Aufruf der Methode setY()
        System.out.println("Die Koordinaten des Punktes sind: ");
        System.out.println(p.getX()); // Wert von x wird ausgegeben
        System.out.println(p.getY()); // Wert von y wird ausgegeben
    }
}
