package a226.h2_2;

import java.util.Date;

public class Note {
    private float note;
    private Date datum;

    public Note(float note, Date datum) {
        this.note = note;
        this.datum = datum;
    }

    public float getNote() {
        return note;
    }

    @Override
    public String toString() {
        return ".Note " + note + " Datum: " + datum;
    }
}
