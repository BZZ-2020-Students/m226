package a226.h2_2;

import java.util.ListIterator;
import java.util.Vector;

public class Fach {
    private String name;
    private String krz;
    private Vector<Note> noten = new Vector<>();

    public Fach(String name, String krz) {
        this.name = name;
        this.krz = krz;
    }

    public void setNote(Note note) {
        noten.add(note);
    }

    public String getSchnitt(){
        ListIterator<Note> itr = noten.listIterator();
        int schnitt = 0;
        int count = 0;
        while (itr.hasNext()){
            count++;
            schnitt += itr.next().getNote();
        }
        String strSchnitt = Float.toString((float)schnitt/count);
        return strSchnitt;
    }

    @Override
    public String toString() {
        String out = name + " ("+krz+") : Schnitt="+getSchnitt();
        ListIterator<Note> itr = noten.listIterator();
        int count = 0;
        while (itr.hasNext()){
            count++;
            out += "\n\t"+ count + itr.next().toString();
        }
        return out;
    }
}
