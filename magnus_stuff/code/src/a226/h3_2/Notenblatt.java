package a226.h3_2;

import a226.h2_2.Note;

import java.util.Date;
import java.util.ListIterator;
import java.util.Vector;

public class Notenblatt {
    private String name;
    private String vorname;
    private Vector<Fach> faecher = new Vector<>();

    public Notenblatt(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Vector<Fach> getFaecher() {
        return faecher;
    }

    public void setFach(Fach fach) {
        faecher.add(fach);
    }

    public void getFach(int index) {
        faecher.get(index);
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

    public void sortiereNachFach(){
        for(int i=0; i < faecher.size(); i++){
            for(int j=1; j < (faecher.size()-i-1); j++) {
                int ret = faecher.get(i).compareTo(faecher.get(j));
                if (ret == 1) {
                    Fach temp = faecher.get(j);
                    faecher.set(j, faecher.get(i));
                    faecher.set(i, temp);
                }
            }
        }
    }

    public void sortiereNachNotenwert(){
        for (Fach fach : faecher) {
            fach.sortiereNotenNachWert();
        }
    }

    public void sortiereNachDatumswert(){
        for (Fach fach : faecher) {
            fach.sortiereNoteNachDatum();
        }
    }

    public static void main(String[] args) {
        Notenblatt max = new Notenblatt("Muster", "Max");
        Fach mat = new Fach("Mahtematik", "MAT");
        Fach deu = new Fach("Deutsch", "DEU");
        Fach eng = new Fach("Englisch", "ENG");
        Fach inf = new Fach("Informatik", "INF");
        max.setFach(mat);
        max.setFach(deu);
        max.setFach(eng);
        max.setFach(inf);
        mat.setNote(new a226.h3_2.Note(5.0f, 2021,2,3));
        mat.setNote(new a226.h3_2.Note(3.0f, 2021,2,4));
        deu.setNote(new a226.h3_2.Note(6.0f, 2021,2,5));
        deu.setNote(new a226.h3_2.Note(3.5f, 2021,2,6));
        deu.setNote(new a226.h3_2.Note(6.0f, 2021,2,7));
        eng.setNote(new a226.h3_2.Note(5.5f, 2021,2,8));
        eng.setNote(new a226.h3_2.Note(3.0f, 2021,2,9));
        eng.setNote(new a226.h3_2.Note(5.5f, 2021,2,10));
        inf.setNote(new a226.h3_2.Note(5.5f, 2021,2,11));
        inf.setNote(new a226.h3_2.Note(5.5f, 2021,2,12));
        inf.setNote(new a226.h3_2.Note(5.0f, 2021,2,13));
        System.out.println(max);

        max.sortiereNachFach();
        max.sortiereNachDatumswert();

        System.out.println(max);
    }
}
