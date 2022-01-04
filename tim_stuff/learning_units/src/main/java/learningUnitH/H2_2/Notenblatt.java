package learningUnitH.H2_2;

import java.util.Vector;

public class Notenblatt {
    private String name;
    private String vorname;
    private Vector<Fach> fachListe;

    public Notenblatt(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        this.fachListe = new Vector<>();
        run();
    }

    public static void main(String[] args) {
        new Notenblatt("Irmler", "Tim");
    }

    private void run() {
        Fach mat = new Fach("Mathematik", "MAT");
        mat.addNote(new Note(3, 2014, 5, 25));
        mat.addNote(new Note(3.5f, 2014, 3, 4));
        mat.addNote(new Note(4, 2014, 6, 24));
        fachListe.add(mat);

        Fach deu = new Fach("Deutsch", "DEU");
        deu.addNote(new Note(5, 2014, 4, 12));
        deu.addNote(new Note(5, 2014, 3, 23));
        deu.addNote(new Note(6, 2014, 6, 12));
        deu.addNote(new Note(5, 2014, 5, 21));
        fachListe.add(deu);

        Fach eng = new Fach("Englisch", "ENG");
        eng.addNote(new Note(4.5f, 2014, 5, 16));
        eng.addNote(new Note(3, 2014, 6, 22));
        eng.addNote(new Note(5, 2014, 4, 22));
        fachListe.add(eng);

        Fach inf = new Fach("Informatik", "INF");
        inf.addNote(new Note(6, 2014, 3, 25));
        inf.addNote(new Note(5.5f, 2014, 4, 12));
        inf.addNote(new Note(5.5f, 2014, 5, 6));
        inf.addNote(new Note(6, 2014, 6, 5));
        inf.addNote(new Note(5, 2014, 6, 30));
        inf.addNote(new Note(5, 2014, 7, 3));
        fachListe.add(inf);

        System.out.println("UNSORTIERT");
        System.out.println("****************************************************************");
        System.out.println(this);

        System.out.println("SORTIERT nach Datum");
        System.out.println("****************************************************************");
        this.sortiereNachDatumsWert();
        System.out.println(this);

        System.out.println("SORTIERT nach Fächern");
        System.out.println("****************************************************************");
        this.sortiereNachFach();
        System.out.println(this);

        System.out.println("SORTIERT nach noten");
        System.out.println("****************************************************************");
        this.sortiereNachNotenwert();
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Vector<Fach> getFachListe() {
        return fachListe;
    }

    public void setFachListe(Vector<Fach> fachListe) {
        this.fachListe = fachListe;
    }

    public void sortiereNachFach() {
        fachListe.sort(null);
    }

    public void sortiereNachNotenwert() {
        for (Fach fach : fachListe) {
            fach.sortiereNotenNachWert();
        }
    }

    public void sortiereNachDatumsWert() {
        for (Fach fach : fachListe) {
            fach.sortiereNoteNachDatum();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Notenblatt für " + name + " " + vorname + "\n" +
                "---------------------------------------------------------" +
                "\n");

        for (Fach fach : fachListe) {
            result.append(fach).append("\n");
        }

        return result.toString();
    }
}
