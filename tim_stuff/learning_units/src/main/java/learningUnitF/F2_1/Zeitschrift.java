package learningUnitF.F2_1;

public class Zeitschrift extends PrintMedium {
    private final String ausgabeDatum;

    public Zeitschrift(String titel, String verlag, String ausgabeDatum) {
        super(titel, verlag);
        this.ausgabeDatum = ausgabeDatum;
    }

    public String getAusgabeDatum() {
        return ausgabeDatum;
    }
}
