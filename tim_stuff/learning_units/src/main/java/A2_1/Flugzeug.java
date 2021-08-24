package A2_1;

public class Flugzeug {
    private int gewicht;
    private int teamgroesse = 3;

    public Flugzeug() {
        teamgroesse = 3;
    }

    public Flugzeug(int teamgroesse) {
        this.teamgroesse = teamgroesse;
    }

    public int getTeamgroesse() {
        return teamgroesse;
    }

    public void setTeamgroesse(int teamgroesse) {
        this.teamgroesse = teamgroesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    // Don't go over limit
    public void setGewicht1(int gewicht) {
        this.gewicht = Math.min(gewicht, 50000);
    }

    // Don't go over limit
    public void setGewicht2(int gewicht) {
        if (gewicht > 50000) {
            throw new IllegalArgumentException();
        } else {
            this.gewicht = gewicht;
        }
    }

    public static void main(String[] args) {
        new Flugzeug();
    }
}