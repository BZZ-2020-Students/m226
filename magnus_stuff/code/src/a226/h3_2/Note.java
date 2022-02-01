package a226.h3_2;


import java.util.GregorianCalendar;

public class Note {
    private float note;
    private GregorianCalendar datum;

    public Note(float note, int jahr, int monat, int tag) {
        this.note = note;
        this.datum = datum;
        datum = new GregorianCalendar(jahr,monat,tag);
    }

    public float getNote() {
        return note;
    }

    public GregorianCalendar getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return ".Note " + note + " Datum: " + datum.get(5) +"."+ datum.get(2) +"."+ datum.get(1);
    }
}
