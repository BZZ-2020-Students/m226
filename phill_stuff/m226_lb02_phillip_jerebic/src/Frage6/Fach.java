package Frage6;

public class Fach {
    public int MAX_NOTEN = 5;
    private String bezeichnung;
    private float[] noten = new float[MAX_NOTEN];
    private int notenCounter;

    public Fach(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return "Fach: "+bezeichnung;
    }

    public boolean addNote(float note) {
        if (notenCounter <= MAX_NOTEN) {
            noten[notenCounter] = note;
            notenCounter++;
            return true;
        }else{
            return false;
        }
    }

    public int getAnzahlNoten() {
        return notenCounter;
    }

    public float getNotenwert(int index) {
        return noten[index];
    }
}
