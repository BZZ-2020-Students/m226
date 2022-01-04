package learningUnitH.H2_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note extends NotenWertVergleicher {
    private float note;
    private GregorianCalendar datum;

    public Note(float note, int year, int month, int day) {
        this.note = note;
        this.datum = new GregorianCalendar();
        this.datum.set(year, month, day);
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public GregorianCalendar getDatum() {
        return datum;
    }

    public void setDatum(GregorianCalendar datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return this.note + ", Datum: " + datum.get(Calendar.DAY_OF_MONTH) + "." + datum.get(Calendar.MONTH) + "." + datum.get(Calendar.YEAR);
    }
}
