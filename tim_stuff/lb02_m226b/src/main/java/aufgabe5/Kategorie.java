package aufgabe5;

public class Kategorie {
    private String bezeichnung;
    private int maxAnzahlLizenzierteSpieler;

    public Kategorie(String bezeichnung, int maxLizenziert) {
        this.bezeichnung = bezeichnung;
        this.maxAnzahlLizenzierteSpieler = maxLizenziert;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getMaxAnzahlLizenzierteSpieler() {
        return this.maxAnzahlLizenzierteSpieler;
    }

    public void setMaxAnzahlLizenzierteSpieler(int maxAnzahlLizenzierteSpieler) {
        this.maxAnzahlLizenzierteSpieler = maxAnzahlLizenzierteSpieler;
    }
}