package F2_1;

public class Zeitschrift extends PrintMedium {
    private String ausgabeDatum;

    public Zeitschrift(String titel, String verlag, String datum) {
        super(titel, verlag);
        ausgabeDatum = datum;
    }

    public String getAusgabeDatum() {
        return ausgabeDatum;
    }
}
