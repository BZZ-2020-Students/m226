package learningUnitH.H1_1;

import java.util.Vector;

public class ArrayDemo {
    private Vector<Float> noten;
    private int notenZaehler;

    public ArrayDemo() {
        noten = new Vector<>();
        notenZaehler = 0;
    }
  
    /*
    Die hier programmierten Methoden "schützen" das Array nicht
    vor falscher Indexierung. Somit ist die fehlerfreie Ausführung
    des Programms nicht gewährleistet.

    Durch den Einbau von Exceptionhanlder soll die Software wieder
    in einen betriebssicheren Zustand gebracht werden.
    */

    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        try {
            demo.addWert(4.5f);
            demo.addWert(5.0f);
            demo.addWert(3.5f);
            demo.addWert(4.0f);
            demo.addWert(6.5f);
            demo.addWert(4.5f);
            // und einen nächsten Wert einfügen, der zu einem Arrayüberlauf führen wird.
            demo.addWert(3.5f);
        } catch (NotenbereichException notenException) {
            System.out.println("Fehler 1:" + notenException.getMessage());
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Fehler 2: Zu viele Werte eingegeben\n");
        }
        demo.print();

        System.out.println("\n\nLösche Wert an 2. Stelle");
        demo.removeWert(1); // index beginnt bei 0
        demo.print();

        // und nun einen Wert an einer Stelle lesen, die es nicht gibt
        try {
            System.out.print("\n\n8. Note = ");
            System.out.println(demo.getNote(8));
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(" falscher Index; gültige Werte von 0 bis " + (demo.getNoten().size() - 1) + "\n\n");
        }

        System.out.println("\n\nArray umfasst zur Zeit " + demo.getAnzahlElemente() + " Elemente");
        System.out.println("Wert an 2. Stelle ist " + demo.getNote(1));
        System.out.println("Grösse des Array ist " + demo.getNoten().capacity());
        System.out.println("=====================================================");
        demo.print();
    }

    public void addWert(float note) throws NotenbereichException {
        if (note < 1.0 || note > 6.0) {
            throw new NotenbereichException();
        } // end of if
        else {
            noten.add(note);
        }
    }

    public int getAnzahlElemente() {
        return noten.size();
    }

    public float getNote(int index) {
        return noten.get(index);
    }

    public void removeWert(int index) {
        noten.remove(index);
    }

    public void print() {
        for (int i = 0; i < noten.size(); i++) {
            System.out.println(i + 1 + ". Note: " + noten.get(i));
        }
    }

    public Vector<Float> getNoten() {
        return noten;
    }
}