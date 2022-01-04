package learningUnitH.H2_2;

import java.util.Vector;

public class Fach extends NotenWertVergleicher implements Comparable<Fach> {
    private String bezeichnung;
    private String kurzzeichen;
    private Vector<Note> notenSammlung;

    public Fach(String bezeichnung, String kurzzeichen) {
        this.bezeichnung = bezeichnung;
        this.kurzzeichen = kurzzeichen;
        notenSammlung = new Vector<>();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getKurzzeichen() {
        return kurzzeichen;
    }

    public void setKurzzeichen(String kurzzeichen) {
        this.kurzzeichen = kurzzeichen;
    }

    public void addNote(Note note) {
        this.notenSammlung.add(note);
    }

    public Vector<Note> getNotenSammlung() {
        return notenSammlung;
    }

    public void setNotenSammlung(Vector<Note> notenSammlung) {
        this.notenSammlung = notenSammlung;
    }

    public float getSchnitt() {
        float summe = 0;
        for(Note note : notenSammlung) {
            summe += note.getNote();
        }

        return summe / notenSammlung.size();
    }

    public void sortiereNotenNachWert() {
        // TODO: 04.01.2022
    }

    public void sortiereNoteNachDatum() {
        // TODO: 04.01.2022
    }

    @Override
    public int compareTo(Fach o) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(bezeichnung + "(" + kurzzeichen + ")" + " : " + getSchnitt() + "\n");
        int counter=1;
        for (Note note : notenSammlung) {
            result.append("\t").append(counter++).append(". Note ").append(note).append("\n");
        }

        return result.toString();
    }
}
