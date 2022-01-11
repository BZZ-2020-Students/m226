import java.util.ListIterator;
import java.util.Vector;

public class Fach {
    private String bezeichnung;
    private String kurzzeichen;
    private Vector<Note> notenSammlung;

    public Fach(String bezeichnung, String kurzform) {
        this.bezeichnung = bezeichnung;
        this.kurzzeichen = kurzform;
        this.notenSammlung = new Vector();
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

    public String toString() {
        String s = this.bezeichnung + " (" + this.kurzzeichen + ") : Schnitt=" + this.getSchnitt();
        ListIterator i = notenSammlung.listIterator();
        while (i.hasNext()) {
            s += "\n\t"+ (i.nextIndex()+1) + ".Note " +i.next();
        }
        return s;
    }
    public static void main(String[] args) {
        Fach fach = new Fach("Informatik", "INF");
        fach.addNote(new Note(5.0F, 2021, 9, 12));
        System.out.println(fach);
    }


}