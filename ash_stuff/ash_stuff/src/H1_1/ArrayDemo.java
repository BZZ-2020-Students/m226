package H1_1;

import java.util.Vector;

public class ArrayDemo {

    public int MAX_STELLEN = 5;   /* später für JUNit-Test benötigt */
    private Vector<Float> noten ;



    public ArrayDemo() {
        noten = new Vector<Float>(MAX_STELLEN);
    }
  
  /*
  Die hier programmierten Methoden "schützen" das Array nicht
  vor falscher Indexierung. Somit ist die fehlerfreie Ausführung
  des Programms nicht gewährleitet.
  
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
            demo.addWert(3.5f);
        } catch (NotenbereichException notenException) {
            System.err.println(notenException.getMessage());
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Too many values\n");
        }

        demo.print();

        System.out.println("\n\nLösche Wert an 2. Stelle");
        demo.removeWert(1); // index beginnt bei 0
        demo.print();

        try {
            System.out.print("\n\n8. Note = ");
            System.out.println(demo.getNote(8));
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(" falscher Index; gültige Werte von 0 bis " + (demo.MAX_STELLEN - 1) + "\n\n");
        }

        System.out.println("\n\nArray umfasst zur Zeit " + demo.getAnzahlElemente() + " Elemente");
        System.out.println("Wert an 3. Stelle ist " + demo.getNote(2));
        System.out.println("Grösse des Array ist " + demo.getMaxGroesse());
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

    public int getMaxGroesse() {
        return MAX_STELLEN;
    }

    public int getAnzahlElemente() {
        return noten.size();
    }

    public float getNote(int index) {
        return noten.get(index);

    }

    public void removeWert(int index) {
        if (index > noten.size()) {
            System.out.println("Index " + index + " exist nicht");
        } else {
            noten.remove(index);
        }
    }

    public void print() {
        for (int i = 0; i < noten.size(); i++) {
            System.out.println(i + 1 + ". Note: " + noten.get(i));
        }
    }
}