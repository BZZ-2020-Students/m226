import java.util.Collections;
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

        // ausgabe unsortiert exakte Reihenfolge wie oben
        System.out.println(notenblatt.toString());

        // ausgabe Sortierung nach Fach -> Anfangsbuchstaben -> ABC ?
        notenblatt.sortiereNachFach();
        System.out.println(notenblatt);

        // ausgabe Sortierung nach Notenwert -> von kleinster Note zur höchsten
        // keine Sortierung nach Fach
        notenblatt.sortiereNachNotenwert();
        System.out.println(notenblatt);

        // ausgabe Sortierung nach Datumswert -> von ältester Note zur neusten
        // keine Sortierung nach Fach
        notenblatt.sortiereNachDatumswert();
        System.out.println(notenblatt);

        // ausgabe Sortierung nach Datumswert + nach Fach
        notenblatt.sortiereNachDatumswert();
        notenblatt.sortiereNachFach();
        System.out.println(notenblatt);

    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Vector<Fach> getFachListe() {
        return fachListe;
    }

    public void setFach(Fach fach) {
        fachListe.add(fach);
    }

    public Fach getFach(int index) {
        return fachListe.get(index);
    }

    public String toString() {
        String s = "Notenblatt für " + name + " " + vorname + "\n----------------------------------------\n";
        ListIterator l = fachListe.listIterator();
        while (l.hasNext()) {
            s += l.next() + "\n\n";
        }

        return s;
    }

    //    Die Methode greift auf die Collections-Klasse und die eigene Klasse
    //    NotenDatumVergleicher zurück, um die Sortierung zu bewerkstelligen.
    public void sortiereNachFach() {
        Collections.sort(fachListe);
    }

    public void sortiereNachNotenwert() {
        for (Fach f : fachListe) {
            f.sortiereNotenNachWert();
        }
    }

    public void sortiereNachDatumswert() {
        for (Fach f : fachListe) {
            f.sortiereNoteNachDatum();
        }
    }
}
