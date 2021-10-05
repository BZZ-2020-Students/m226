package uebungschulklasse;

public class Lernende {
    private String nachname;
    private String vorname;
    private int geburtsjahr;

    public Lernende(String _nachname, String _vorname, int _geburtsjahr) {
        nachname = _nachname;
        vorname = _vorname;
        geburtsjahr = _geburtsjahr;
    }

    public String getName() {
        return vorname + " " + nachname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }
}
