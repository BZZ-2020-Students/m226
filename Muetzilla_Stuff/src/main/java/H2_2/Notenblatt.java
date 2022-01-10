package H2_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Notenblatt {
    private ArrayList<Fach> faecher = new ArrayList<>();

    public Notenblatt() {
        faecher.add(new Fach("Französisch", "Franz"));
        faecher.get(0).addNote(new Note(4f, 5, 11, 2022));
        faecher.get(0).addNote(new Note(3.5f, 12, 10, 2021));
        faecher.get(0).addNote(new Note(6f, 9, 3, 2021));
        faecher.get(0).addNote(new Note(5f, 1, 0, 2020));
        faecher.add(new Fach("Mathematik", "Mathe"));
        faecher.get(1).addNote(new Note(3.75f, 12, 9, 2019));
        faecher.get(1).addNote(new Note(4.5f, 18, 10, 2022));
        faecher.get(1).addNote(new Note(5.5f, 7, 7, 2021));
        faecher.get(1).addNote(new Note(5f, 10, 5, 2020));
        faecher.add(new Fach("Deutsch", "DE"));
        faecher.get(2).addNote(new Note(4f, 6, 0, 2022));
        faecher.get(2).addNote(new Note(5.5f, 14, 6, 2021));
        faecher.get(2).addNote(new Note(3f, 18, 8, 2021));
        faecher.get(2).addNote(new Note(4.25f, 27, 9, 2020));


        print();
        System.out.println("----------------------------------- Nach Datum Sortiert ----------------------------------------");
        sortiertNachDatum();
        print();
        System.out.println("----------------------------------- Nach Wert Sortiert ----------------------------------------");
        sortiertNachWert();
        print();
    }

    public static void main(String[] args) {
        Notenblatt notenblatt = new Notenblatt();
    }

    public void print() {
        System.out.println("Notenblatt für Max Mustermann");
        System.out.println("-----------------------------");
        Iterator<Fach> iterator = faecher.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void sortiertNachDatum() {
        for (Fach f : faecher) {
            f.notenNachDatum();
        }
    }

    public void sortiertNachWert() {
        for (Fach f : faecher) {
            f.notenNachWert();
        }
    }
}
