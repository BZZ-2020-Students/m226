package Frage5;

public class Zeugnis {
    public int MAX_FAECHER = 5;
    private Schueler schueler;
    private Fach[] faecher = new Fach[MAX_FAECHER];
    private int fachCounter;

    public Zeugnis(Schueler schueler){
        this.schueler = schueler;
    }

    public boolean addFach(Fach fach){
        if (fachCounter <= MAX_FAECHER) {
            faecher[fachCounter] = fach;
            fachCounter++;
            return true;
        }else{
            return false;
        }
    }

    public String getSchuelerName() {
        return schueler.getNameVorname();
    }

    public Fach getFach(int index) {
        return faecher[index];
    }

    public String getFachName(int index) {
        return faecher[index].getBezeichnung();
    }

    public String printZeugnis(){
        return "";
    }
}
