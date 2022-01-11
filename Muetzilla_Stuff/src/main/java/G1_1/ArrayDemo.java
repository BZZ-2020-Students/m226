package G1_1;

public class ArrayDemo {

    public int MAX_STELLEN = 5;   /* sp�ter f�r JUNit-Test ben�tigt */
    private float[] noten;
    private int notenZaehler;


    public ArrayDemo() {
        noten = new float[MAX_STELLEN];
        notenZaehler = 0;
    }
  
  /*
  Die hier programmierten Methoden "sch�tzen" den Array nicht
  vor falscher Indexierung. Somit ist die fehlerfreie Ausf�hrung
  des Programms nicht gew�hrleitet.
  
  Durch den Einbau von Exceptionhanlder soll die Software wieder
  in einen betriebssicheren Zustand gebracht werden.
  
  */

    public void addWert(float note) throws NotenbereichExeption {
        if (note < 1.0 || note > 6.0) {
            noten[notenZaehler] = note;
            notenZaehler++; /* wegen Exception erst hier inkrementieren */
        } else {
            throw new NotenbereichExeption();
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
            /* Z�hler i ist kleiner als Index --> Wert belassen */
            if (i < index) {
                j++; // den Z�hler f�r Kopieren nachf�hren
            } // end of if
            else {
                if (i == index) {
                    j++; // einmalig den Z�hler um eine Stelle erh�hen
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
            demo.addWert(4.0f);
            demo.addWert(7f);
            demo.addWert(3.5f);
        } catch (ArrayIndexOutOfBoundsException | NotenbereichExeption ex) {
            System.out.println("Es ist ein Fehler aufgetreten: " + ex.getMessage());
        }
        demo.print();
        //
        System.out.println("\n\nL�sche Wert an 2. Stelle");
        demo.removeWert(1); // index beginnt bei 0
        demo.print();
        //
        System.out.print("\n\n8. Note = ");
        try {
            System.out.println(demo.getNote(8));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Der gewünschte Index kann nicht abgerufen werden, da er nicht existiert!");
        }
        //
        System.out.println("\n\nArray umfasst zur Zeit " + demo.getAnzahlElemente() + " Elemente");
        System.out.println("Wert an 3. Stelle ist " + demo.getNote(2));
        System.out.println("Gr�sse des Array ist " + demo.getMaxGroesse());
        System.out.println("=====================================================");
        demo.print();
    }
}