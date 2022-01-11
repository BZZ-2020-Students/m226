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

    @Override
    public void showInfo() {
        System.out.println(addTab2Text(titel) + addTab2Text(verlag) + addTab2Text("") + addTab2Text("") + addTab2Text(ausgabeDatum));
    }
}
