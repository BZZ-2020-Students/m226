import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class Fach implements Comparable<Fach> {

    private String bezeichnung;
    private String kurzzeichen;
    private Vector<Note> notenSammlung;

    public Fach(String bezeichnung, String kurzform) {
        this.bezeichnung = bezeichnung;
        this.kurzzeichen = kurzform;
        this.notenSammlung = new Vector();
    }

    public static void main(String[] args) {
        Fach fach = new Fach("Informatik", "INF");
        fach.addNote(new Note(4.0F, 2014, 12, 5));
        fach.addNote(new Note(4.5F, 2014, 10, 26));
        fach.addNote(new Note(5.0F, 2014, 9, 13));
        System.out.println(fach);
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public String getKurzzeichen() {
        return this.kurzzeichen;
    }

    public float getSchnitt() {
        float schnitt = 0.0F;
        int i;
        for (i = 0; i < this.notenSammlung.size(); ++i) {
            schnitt += this.notenSammlung.get(i).getNote();
        }
        return schnitt / (float) i;
    }

    public void addNote(Note note) {
        this.notenSammlung.add(note);
    }

    public Note getNote(int index) {
        return this.notenSammlung.get(index);
    }

    public String toString() {
        String s = this.bezeichnung + " (" + this.kurzzeichen + ") : Schnitt=" + this.getSchnitt();
        ListIterator i = notenSammlung.listIterator();
        while (i.hasNext()) {
            s += "\n\t" + (i.nextIndex() + 1) + ".Note " + i.next();
        }
        return s;
    }

    public void sortiereNotenNachWert() {
        Collections.sort(notenSammlung, new NotenWertVergleicher());
    }

    public void sortiereNoteNachDatum() {
        Collections.sort(notenSammlung, new NotenDatumVergleicher());
    }

    @Override
    public int compareTo(Fach anOtherFach){
        return this.bezeichnung.compareTo(anOtherFach.getBezeichnung());
    }
}
