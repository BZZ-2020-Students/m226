package H2_2;

import java.util.Date;
import java.util.ListIterator;

public class Note {
    private float notenwert;

    public Date getDatum() {
        return datum;
    }

    private Date datum;

    public Note(float notenwert,Date datum){
        this.notenwert = notenwert;
        this.datum = datum;
    }

    public float getNotenwert() {
        return notenwert;
    }

    @Override
    public String toString(){
        return "Note " + notenwert + " Datum: " + datum+"\n";
    }
}
