package Schulklasse;

public class Klasse {
    private String klassenname;
    private Lehrperson lehrperson;
    private Lernende[] alleLernende;
    private int MAXSIZE;
    private int cntr;

    public Klasse(String _name){
        klassenname = _name;
    }


    public void addLernende(Lernende lernende) {
        alleLernende[cntr] = lernende;
    }

    public void setLehrperson(Lehrperson lehrperson) {
        this.lehrperson = lehrperson;
    }

    public String getKlassenname() {
        return klassenname;
    }

    public Lehrperson getLehrperson() {
        return lehrperson;
    }

    public int getAnzahlLernende(){
        return MAXSIZE;
    }

    public String getNameLernende(int index){
        return alleLernende[index].getName();
    }

    public int getLernenedGeburtsjahr(int index){
        return alleLernende[index].getGeburtsjahr();
    }

}

