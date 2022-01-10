package H3_2;

import java.util.Date;

public class Note {
    private final float notenwert;

    public Date getDatum() {
        return datum;
    }

    private final Date datum;

    public Note(float notenwert,Date datum){
        this.notenwert = notenwert;
        this.datum = datum;
    }

    public float getNotenwert() {
        return notenwert;
    }

    @Override
    public String toString(){
        return "        Note " + notenwert + " Datum: " + datum+"\n";
    }
}
