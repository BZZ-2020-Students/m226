package H3_2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Fach implements Comparable<Fach>{
    private String fachname;
    private String fachkuerzel;
    private ArrayList<Note> notenSammlung;

    public Fach(String fachname,String fachkuerzel){
        this.fachname = fachname;
        this.fachkuerzel = fachkuerzel;
        this.notenSammlung = new ArrayList<>();
    }

    public float schnitt(){
        ListIterator<Note> iterator = notenSammlung.listIterator();
        float schnitt = 0;
        while(iterator.hasNext()){
            schnitt += iterator.next().getNotenwert();
        }
        return schnitt/notenSammlung.size();
    }

    public String getFachname() {
        return fachname;
    }

    public String getFachkuerzel() {
        return fachkuerzel;
    }

    public void setNote(Note note) {
        notenSammlung.add(note);
    }

    public ArrayList<Note> getNotenSammlung() {
        return notenSammlung;
    }

    public Note getNote(int index) {
        return notenSammlung.get(index);
    }

    @Override
    public String toString() {

        ListIterator<Note> it = notenSammlung.listIterator();
        String returnwert = "";
        while (it.hasNext()) {
            returnwert += it.next().toString();

        }
        return fachname +" ("+fachkuerzel+") : Schnitt="+schnitt()+"\n" + returnwert;
    }

    public void sortiereNotenNachWert(){
        notenSammlung.sort(new NotenWertVergleicher());
    }

    public void sortiereNoteNachDatum(){
        notenSammlung.sort(new NotenDatumVergleicher());
    }

    @Override
    public int compareTo(Fach anOtherFach) {
        return fachname.compareTo(anOtherFach.getFachname());
    }

}
