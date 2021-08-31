package B2_2;

public class BankKonto {
    private float kontostand;
    private float aktZinsen;
    private float maxUnterdeckung;
    private String besitzer;

    public BankKonto() {
        this.kontostand = 0.0F;
        this.aktZinsen = 0.0F;
        this.maxUnterdeckung = 0.0F;
        this.besitzer = null;
    }

    public BankKonto(float wert) {
        this.kontostand = wert;
    }

    public BankKonto(float wert, float zinssatz) {
        this.kontostand = wert;
        this.aktZinsen = zinssatz;
    }

    public BankKonto(float wert, float zinssatz, float deckung) {
        this.kontostand = wert;
        this.aktZinsen = zinssatz;
        this.maxUnterdeckung = deckung;
    }

    public BankKonto(float wert, float zinssatz, float deckung, String person) {
        this.kontostand = wert;
        this.aktZinsen = zinssatz;
        this.maxUnterdeckung = deckung;
        this.besitzer = person;
    }

    public void zeigeKontoInfo() {
        System.out.println("Besitzer: " + this.besitzer + "Kontostand: " + this.kontostand + "Zinssatz: " + this.aktZinsen + "Unterdeckung: " + this.maxUnterdeckung + "----------------------------------");
    }

    public static void main(String[] args) {
        BankKonto kontoLeer = new BankKonto();
        BankKonto kontoX = new BankKonto(1000.0F, 5.0F);
        BankKonto kontoMoritz = new BankKonto(500.0F, 2.5F, 250.0F, "Moritz");
        kontoLeer.zeigeKontoInfo();
        kontoX.zeigeKontoInfo();
        kontoMoritz.zeigeKontoInfo();
    }
}

