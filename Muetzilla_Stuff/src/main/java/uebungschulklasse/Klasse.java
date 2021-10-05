package uebungschulklasse;

public class Klasse {
    private String klassenname;
    private Lehrperson lehrperson;
    private final int MAXSIZE = 5;
    private Lernende[] alleLernenden = new Lernende[MAXSIZE];
    private int cntr = 0;

    public Klasse(String name) {
        klassenname = name;
    }

    public void setLehrperson(Lehrperson lp) {
        lehrperson = lp;
    }

    public void addLernende(Lernende lernende) {
        if (cntr < MAXSIZE) {
            alleLernenden[cntr] = lernende;
            cntr++;
        }
    }

    public String getKlassenname() {
        return klassenname;
    }

    public Lehrperson getLehrperson() {
        return lehrperson;
    }

    public int getAnzahlLernende() {
        return cntr;
    }

    public String getNameLernende(int index) {
        return alleLernenden[index].getName();
    }

    public int getLerndendeGeburtsJahr(int index) {
        return alleLernenden[index].getGeburtsjahr();
    }
}
