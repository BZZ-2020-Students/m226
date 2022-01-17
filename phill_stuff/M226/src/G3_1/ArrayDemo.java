package G3_1;

import G2_1.NotenbereichException;

public class ArrayDemo {

    public int MAX_STELLEN = 5;   /* später für JUNit-Test benötigt */
    private float[] noten;
    private int notenZaehler;


    public ArrayDemo() {
        noten = new float[MAX_STELLEN];
        notenZaehler = 0;
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
            System.out.println(" falscher Index; gültige Werte von 0 bis " + (demo.MAX_STELLEN - 1) + "\n\n");
        }

        System.out.println("\n\nArray umfasst zur Zeit " + demo.getAnzahlElemente() + " Elemente");
        System.out.println("Wert an 2. Stelle ist " + demo.getNote(1));
        System.out.println("Grösse des Array ist " + demo.getMaxGroesse());
        System.out.println("=====================================================");
        demo.print();
    }

    public void addWert(float note) throws NotenbereichException {
        if (note < 1.0 || note > 6.0) {
            throw new NotenbereichException("msg");
        } // end of if
        else {
            noten[notenZaehler] = note;
            notenZaehler++; /* wegen Exception erst hier inkrementieren */
        }
    }

    public int getMaxGroesse() {
        return MAX_STELLEN;
    }

    public int getAnzahlElemente() {
        return notenZaehler;
    }

    public float getNote(int index) {
        return noten[index];
    }

    public void removeWert(int index) {
        for (int i = 0, j = 0; i < (notenZaehler - 1); i++) {
            /* Zähler i ist kleiner als Index --> Wert belassen */
            if (i < index) {
                j++; // den Zähler für Kopieren nachführen
            }
            else {
                if (i == index) {
                    j++; // einmalig den Zähler um eine Stelle erhöhen
                }
                noten[i] = noten[j++];
            }
        }
        // Index muss um eins tiefer gesetzt werden
        notenZaehler--;
    }

    public void print() {
        for (int i = 0; i < notenZaehler; i++) {
            System.out.println(i + 1 + ". Note: " + noten[i]);
        }
    }
}