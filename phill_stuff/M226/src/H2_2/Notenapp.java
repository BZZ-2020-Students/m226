package H2_2;

import java.util.Date;

public class Notenapp {
    public static void main(String[] args) {
        Person p1 = new Person("Muster","Max");

        Note mnote1 = new Note(3.0f,new Date());
        Note mnote2 = new Note(3.5f,new Date());
        Note mnote3 = new Note(4.0f,new Date());
        Fach mathe = new Fach("Mathematik","MAT");


        mathe.setNote(mnote1);
        mathe.setNote(mnote2);
        mathe.setNote(mnote3);

        Note dnote1 = new Note(5.0f,new Date());
        Note dnote2 = new Note(5.5f,new Date());
        Note dnote3 = new Note(6.0f,new Date());
        Note dnote4 = new Note(5.0f,new Date());
        Fach deutsch = new Fach("Deutsch","DEU");

        deutsch.setNote(dnote1);
        deutsch.setNote(dnote2);
        deutsch.setNote(dnote3);
        deutsch.setNote(dnote4);

        Note enote1 = new Note(4.0f,new Date());
        Note enote2 = new Note(3.5f,new Date());
        Note enote3 = new Note(5.0f,new Date());
        Fach english = new Fach("Englisch","ENG");

        english.setNote(enote1);
        english.setNote(enote2);
        english.setNote(enote3);

        Note inote1 = new Note(6.0f,new Date());
        Note inote2 = new Note(5.5f,new Date());
        Note inote3 = new Note(6.0f,new Date());
        Fach informatik = new Fach("Informatik","INF");

        informatik.setNote(inote1);
        informatik.setNote(inote2);
        informatik.setNote(inote3);

        p1.setFach(mathe);
        p1.setFach(deutsch);
        p1.setFach(english);
        p1.setFach(informatik);

        System.out.println(p1.toString());
    }
}
