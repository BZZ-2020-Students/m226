package a226.f2_1;

public class Zeitschrift extends PrintMedium{
    private String ausgabeDatum;

    public Zeitschrift(String titel, String verlag, String datum) {
        super(titel, verlag);
        this.ausgabeDatum = datum;
    }

    public String getAusgabeDatum() {
        return this.ausgabeDatum;
    }

    @Override
    public void showinfo() {
        addTabulator2Text("Ausgabedatum: " + ausgabeDatum);
    }
}
