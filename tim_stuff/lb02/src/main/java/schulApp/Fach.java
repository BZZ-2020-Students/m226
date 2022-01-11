package schulApp;

public class Fach {
    public final int MAX_NOTEN;
    private String bezeichnung;
    private float[] noten;
    private int notenCounter;

    public Fach(String bezeichnung) {
        MAX_NOTEN = 5;
        noten = new float[MAX_NOTEN];
        notenCounter = 0;
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public boolean addNote(float note) {
        try {
            noten[notenCounter++] = note;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public int getAnzahlNoten() {
        return notenCounter;
    }

    public float getNotenWert(int index) {
        try {
            return noten[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
