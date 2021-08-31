package learningUnitB.B2_1;

public class Automobil {
    private String automarke;
    private String typ;
    private int kontrollSchildNummer;
    private String farbe;

    public Automobil(String automarke, String typ, int kontrollSchildNummer, String farbe) {
        this.automarke = automarke;
        this.typ = typ;
        this.kontrollSchildNummer = kontrollSchildNummer;
        this.farbe = farbe;
    }

    public static void main(String[] args) {
        Automobil automobil = new Automobil("Mercedes", "Auto", 12312, "Schwarz");
    }
}
