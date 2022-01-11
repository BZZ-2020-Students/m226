package schulApp;

public class Zeugnis {
    public final int MAX_FAECHER;
    private Schueler schueler;
    private Fach[] faecher;
    private int fachCounter;

    public Zeugnis(Schueler schueler) {
        MAX_FAECHER = 3;
        faecher = new Fach[MAX_FAECHER];
        fachCounter = 0;
        this.schueler = schueler;
    }

    public String getSchuelerName() {
        return schueler.getNameVorname();
    }

    public boolean addFach(Fach fach) {
        try {
            faecher[fachCounter++] = fach;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public Fach getFach(int index) {
        try {
            return faecher[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public String getFachName(int index) {
        try {
            return faecher[index].getBezeichnung();
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public String printZeugnis() {
        String zeugnis = "Zeugnis für: " + getSchuelerName() + "\n";
        for (int i = 0; i < fachCounter; i++) {
            Fach fach = faecher[i];

            String fachUndNoten = "\t" + fach.getBezeichnung() + "\n";
            for (int j = 0; j < fach.getAnzahlNoten(); j++) {
                fachUndNoten += "\t\t" + fach.getNotenWert(j) + "\n";
            }
            zeugnis += fachUndNoten;
        }
        return zeugnis;
    }
}
