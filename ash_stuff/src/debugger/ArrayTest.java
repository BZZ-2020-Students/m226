package debugger;

public class ArrayTest {

    private final int SIZE = 20;
    private final int MIN = 1;
    private final int MAX = 50;
    private int[] zahlenReihe;
    private int count;

    public ArrayTest() {
        // Array mit Zufallszahlen füllen.
        // Die Bibliotheksfunktion liefert eine gleitkommazahl.
        // Diese wird in int umgewandelt.
        zahlenReihe = new int[SIZE];
        for (count = 0; count < SIZE; count++) {
            double zufallsZahl = (Math.random() * ((MAX - MIN) + 1)) + MIN;
            zahlenReihe[count] = (int) zufallsZahl;
        }
    }

    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        System.out.println("Array-Test für Anwendung des Debuggers");
        System.out.println(at.toString());
        System.out.println("----");
        at.remove(12);
        System.out.println(at.toString());
        System.out.println("----");
    }

    public String toString() {
        // String mit allen Zahlenwerten des Array auflisten.
        String out = new String();
        for (int i = 0; i < count; i++) {
            out += zahlenReihe[i];
            if (i < count - 1)
                out += ", ";
            else
                out += "\n";
        }
        return out;
    }

    public void remove(int index) {
        // Entfernt den Wert an der Stelle von index aus dem Array
        // Die Stelle wird durch umkopieren der nachfolgenden Werte gefüllt.
        if (index >= 0 && index < count) {
            for (int i = index; i < count -1; i++) { //count - 1 machen
                zahlenReihe[i] = zahlenReihe[i + 1]; //Am ende vom Array versucht es i + 1 finden. Da die Array kein index so gross hat, ist es out of bounds
            }
        }
    }
}