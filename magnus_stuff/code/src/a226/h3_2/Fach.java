package a226.h3_2;

import java.util.ListIterator;
import java.util.Vector;

public class Fach implements Comparable<Fach> {
    private String name;
    private String krz;
    private Vector<Note> noten = new Vector<>();

    public Fach(String name, String krz) {
        this.name = name;
        this.krz = krz;
    }

    public String getName() {
        return name;
    }

    public String getKrz() {
        return krz;
    }

    public void setNote(Note note) {
        noten.add(note);
    }

    public Note getNote(int index) {
        return noten.get(index);
    }

    public String getSchnitt() {
        ListIterator<Note> itr = noten.listIterator();
        int schnitt = 0;
        int count = 0;
        while (itr.hasNext()) {
            count++;
            schnitt += itr.next().getNote();
        }
        String strSchnitt = Float.toString((float) schnitt / count);
        return strSchnitt;
    }

    @Override
    public String toString() {
        String out = name + " (" + krz + ") : Schnitt=" + getSchnitt();
        ListIterator<Note> itr = noten.listIterator();
        int count = 0;
        while (itr.hasNext()) {
            count++;
            out += "\n\t" + count + itr.next().toString();
        }
        return out;
    }

    @Override
    public int compareTo(Fach anOtherFach) {
        int ret = name.compareTo(anOtherFach.name);
        if (ret == 0)
            return 0;
        return 1;
    }

    public void sortiereNotenNachWert() {
        NotenWertVergleicher n = new NotenWertVergleicher();
        for (int i = 0; i < noten.size()-1; i++) {
            int ret = n.compare(noten.get(i), noten.get(i + 1));
            if (ret == 1){
                Note temp = noten.get(i+1);
                noten.set(i+1, noten.get(i));
                noten.set(i, temp);
            }
        }
    }

    public void sortiereNoteNachDatum() {
        NotenDatumVergleicher n = new NotenDatumVergleicher();
        for(int i=0; i < noten.size(); i++){
            for(int j=1; j < (noten.size()-i-1); j++) {
                int ret = n.compare(noten.get(i), noten.get(j));
                if (ret == 1) {
                    Note temp = noten.get(j);
                    noten.set(j, noten.get(i));
                    noten.set(i, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}
