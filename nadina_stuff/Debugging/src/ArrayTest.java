public class ArrayTest {

    private final int SIZE = 20;
    private final int MIN = 1;
    private final int MAX = 50;
    private int[] zahlenReihe;
    private int count;

    public ArrayTest() {
        // Array mit Zufallszahlen f�llen.
        // Die Bibliotheksfunktion liefert eine gleitkommazahl.
        // Diese wird in int umgewandelt.
        zahlenReihe = new int[SIZE];
        for (count = 0; count < SIZE; count++) {
            var zufallsZahl = (Math.random() * ((MAX - MIN) + 1)) + MIN;
            zahlenReihe[count] = (int) zufallsZahl;
        }
    }

    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        System.out.println("Array-Test f�r Anwendung des Debuggers");
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
        count--;
        // Entfernt den Wert an der Stelle von index aus dem Array
        // Die Stelle wird durch umkopieren der nachfolgenden Werte gef�llt.
        if (index >= 0 && index < count) {
            for (int i = index; i < count; i++) {
                zahlenReihe[i] = zahlenReihe[i + 1];
            }
        }
    }
}