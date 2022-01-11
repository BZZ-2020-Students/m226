import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note {
    private float note;
    private GregorianCalendar datum;

    public Note(float note, int year, int month, int day) {
        this.datum = new GregorianCalendar(year, month - 1, day);
        this.note = note;
    }
    public float getNote() {
        return this.note;
    }
    public String toString() {
        return note + " Datum: " + datum.get(Calendar.DAY_OF_MONTH)
                + "." + (datum.get(Calendar.MONTH) + 1)
                + "." + datum.get(Calendar.YEAR);
    }
}
