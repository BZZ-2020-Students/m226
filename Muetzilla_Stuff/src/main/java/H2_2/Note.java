package H2_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note {

    private GregorianCalendar date;

    private float note;

    public Note(float note, int day, int month, int year) {
        this.note = note;
        this.date = new GregorianCalendar();
        date.set(year, month, day);
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }


    @Override
    public String toString() {
        return "Note: " + this.note + " Datum: " + date.get(Calendar.DAY_OF_MONTH) + "." + (date.get(Calendar.MONTH) + 1) + "." + (date.get(Calendar.YEAR) - 1);
    }
}
