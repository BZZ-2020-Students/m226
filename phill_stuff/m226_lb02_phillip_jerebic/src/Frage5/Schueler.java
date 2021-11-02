package Frage5;

public class Schueler {
    private String name;
    private String nachname;

    public Schueler(String meinName,String meinVorname){
        name = meinVorname;
        nachname = meinName;
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public String getNameVorname(){
        return name + " " +nachname;
    }
}
