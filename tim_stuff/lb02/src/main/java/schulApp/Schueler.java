package schulApp;

public class Schueler {
    private String name;
    private String vorname;

    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNameVorname() {
        return name + " " + vorname;
    }
}
