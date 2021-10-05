package uebungschulklasse;

public class Lehrperson {
    private String vorname;
    private String nachname;

    public Lehrperson(String _nachname, String _vorname) {
        nachname = _nachname;
        vorname = _vorname;
    }

    public String getName() {
        return vorname + " " + nachname;
    }

}
