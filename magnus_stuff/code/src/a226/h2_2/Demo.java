package a226.h2_2;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        new Demo().run();
    }


    public void run(){
        Schueler max = new Schueler("Muster", "Max");
        Fach mat = new Fach("Mahtematik", "MAT");
        Fach deu = new Fach("Deutsch", "DEU");
        Fach eng = new Fach("Englisch", "ENG");
        Fach inf = new Fach("Informatik", "INF");
        max.setFach(mat);
        max.setFach(deu);
        max.setFach(eng);
        max.setFach(inf);
        mat.setNote(new Note(5.0f, new Date()));
        mat.setNote(new Note(3.0f, new Date()));
        deu.setNote(new Note(6.0f, new Date()));
        deu.setNote(new Note(3.5f, new Date()));
        deu.setNote(new Note(6.5f, new Date()));
        eng.setNote(new Note(5.5f, new Date()));
        eng.setNote(new Note(3.0f, new Date()));
        eng.setNote(new Note(5.5f, new Date()));
        inf.setNote(new Note(5.5f, new Date()));
        inf.setNote(new Note(5.5f, new Date()));
        inf.setNote(new Note(5.0f, new Date()));

        System.out.println(max);

    }
}
