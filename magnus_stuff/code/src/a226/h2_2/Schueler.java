package a226.h2_2;

import java.util.ListIterator;
import java.util.Vector;

public class Schueler {
    private String name;
    private String vorname;
    private Vector<Fach> faecher = new Vector<>();

    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public void setFach(Fach fach) {
        faecher.add(fach);
    }

    @Override
    public String toString() {
        String out = "Notenblatt fuer " + name + " " + vorname + "\n------------------------------\n";
        ListIterator<Fach> itr = faecher.listIterator();
        while (itr.hasNext()){
            out += itr.next().toString() + "\n\n";
        }
        return out;
    }
}
