package G2_1;

public class ArrayDemo {

    public int MAX_STELLEN = 5;   /* später für JUNit-Test benötigt */
    private float[] noten;
    private int notenZaehler;


    public ArrayDemo() {
        noten = new float[MAX_STELLEN];
        notenZaehler = 0;
    }
  
  /*
  Die hier programmierten Methoden "schützen" den Array nicht
  vor falscher Indexierung. Somit ist die fehlerfreie Ausführung
  des Programms nicht gewährleitet.
  
  Durch den Einbau von Exceptionhanlder soll die Software wieder
  in einen betriebssicheren Zustand gebracht werden.
  
  */

    public void addWert(float note) throws NotenbereichException {
        try {
            if (note <= 1.0 || note >= 6.0) {
                throw new NotenbereichException("Der Notenbereich " + note + " liegt nich zwischen 1 und 6");
            } else {
                noten[notenZaehler] = note;
                notenZaehler++; /* wegen Exception erst hier inkrementieren */
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
        }
    }


    public int getMaxGroesse() {
        return MAX_STELLEN;
    }

    public int getAnzahlElemente() {
        return notenZaehler;
    }

    public float getNote(int index) {
        try {
            return noten[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public void removeWert(int index) {
        for (int i = 0, j = 0; i < (notenZaehler - 1); i++) {
            /* Zähler i ist kleiner als Index --> Wert belassen */
            if (i < index) {
                j++; // den Zähler für Kopieren nachführen
            } // end of if
            else {
                if (i == index) {
                    j++; // einmalig den Zähler um eine Stelle erhöhen
                }
                noten[i] = noten[j++];
            } // end of else
        } // end of for
        // Index muss um eins tiefer gesetzt werden
        notenZaehler--;
    }

    public void print() {
        for (int i = 0; i < notenZaehler; i++) {
            System.out.println(i + 1 + ". Note: " + noten[i]);
        } // end of for
    }


    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        try {
            demo.addWert(4.5f);
            demo.addWert(5.0f);
            demo.addWert(3.5f);
            demo.addWert(7.0f);
            demo.addWert(4.5f);
            demo.addWert(7.0f);
        } catch (NotenbereichException e) {
            e.getMessage();
            e.printStackTrace();
        }

        demo.print();
        //
        System.out.println("\n\nLösche Wert an 2. Stelle");
        demo.removeWert(1); // index beginnt bei 0
        demo.print();
        //
        System.out.print("\n\n8. Note = ");
        System.out.println(demo.getNote(8));
        //
        System.out.println("\n\nArray umfasst zur Zeit " + demo.getAnzahlElemente() + " Elemente");
        System.out.println("Wert an 3. Stelle ist " + demo.getNote(2));
        System.out.println("Grösse des Array ist " + demo.getMaxGroesse());
        System.out.println("=====================================================");
        demo.print();
    }
}