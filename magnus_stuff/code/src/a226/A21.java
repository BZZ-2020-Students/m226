package a226;

public class A21 {
    private int gewicht;
    private String zuladung;
    private int teamgroesse = 3;

    public A21() {
    }

    public A21(int teamgroesse) {
        this.teamgroesse = teamgroesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        if (gewicht <= 50000)
            this.gewicht = gewicht;
    }

    public String getZuladung() {
        return zuladung;
    }

    public void setZuladung(String zuladung) {
        this.zuladung = zuladung;
    }

    public int getTeamgroesse() {
        return teamgroesse;
    }

    public void setTeamgroesse(int teamgroesse) {
        this.teamgroesse = teamgroesse;
    }
}
