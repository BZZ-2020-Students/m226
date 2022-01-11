package H2_2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Person {
    private String name;
    private String vorname;
    private ArrayList<Fach> fachListe;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;

        this.fachListe = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }


    public ArrayList<Fach> getFachliste() {
        return fachListe;
    }

    public Fach getFach(int index) {
        return fachListe.get(index);
    }

    public void setFach(Fach fach) {
        fachListe.add(fach);
    }

    @Override
    public String toString() {
        ListIterator<Fach> it = fachListe.listIterator();
        String returnwert = "";
        while (it.hasNext()) {
            returnwert += it.next().toString();

        }
        return "Notenblatt für " + vorname + " " + name + "\n" + "----------------------------------------- \n" + returnwert;

    }
}
