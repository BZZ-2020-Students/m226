import java.util.ListIterator;
import java.util.Vector;

public class Notenblatt {

    private String name;
    private String vorname;
    private Vector<Fach> fachListe;

    public Notenblatt(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        this.fachListe = new Vector<Fach>();
    }

    public static void main(String[] args) {
        Notenblatt notenblatt = new Notenblatt("Muster", "Max");

        Fach fach;
        fach = new Fach("Mathematik", "MAT");
        fach.addNote(new Note(3.0f, 2014, 5, 25));
        fach.addNote(new Note(3.5f, 2014, 3, 4));
        fach.addNote(new Note(4.0f, 2014, 6, 24));
        notenblatt.setFach(fach);
        fach = new Fach("Deutsch", "DEU");
        fach.addNote(new Note(5.0f, 2014, 4, 12));
        fach.addNote(new Note(5.0f, 2014, 3, 23));
        fach.addNote(new Note(6.0f, 2014, 6, 12));
        fach.addNote(new Note(5.0f, 2014, 5, 21));
        notenblatt.setFach(fach);
        fach = new Fach("Englisch", "ENG");
        fach.addNote(new Note(4.5f, 2014, 5, 16));
        fach.addNote(new Note(3.0f, 2014, 6, 22));
        fach.addNote(new Note(5.0f, 2014, 4, 22));
        notenblatt.setFach(fach);
        fach = new Fach("Informatik", "INF");
        fach.addNote(new Note(6.0f, 2014, 3, 25));
        fach.addNote(new Note(5.5f, 2014, 4, 12));
        fach.addNote(new Note(5.5f, 2014, 5, 6));
        fach.addNote(new Note(6.0f, 2014, 6, 5));
        fach.addNote(new Note(5.0f, 2014, 6, 30));
        fach.addNote(new Note(5.0f, 2014, 7, 3));
        notenblatt.setFach(fach);

        System.out.println(notenblatt.toString());
    }

    public void setFach(Fach fach) {
        fachListe.add(fach);
    }

    public String toString() {
        String s = "Notenblatt für " + name + " " + vorname + "\n----------------------------------------\n";
        ListIterator l = fachListe.listIterator();
        while (l.hasNext()) {
            s += l.next() + "\n\n";
        }
        return s;
    }
}
