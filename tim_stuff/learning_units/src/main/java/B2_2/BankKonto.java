package B2_2;

public class BankKonto {
    private float kontoStand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    public BankKonto() {
        kontoStand = 0.0f;
        aktZinssatz = 0.0f;
        maxUnterdeckung = 0.0f;
        besitzer = null;
    }

    public BankKonto(float wert) {
        this.kontoStand = wert;
    }

    public BankKonto(float wert, float zinssatz) {
        this.kontoStand = wert;
        this.aktZinssatz = zinssatz;
    }

    public BankKonto(float wert, float zinssatz, float deckung) {
        this.kontoStand = wert;
        this.aktZinssatz = zinssatz;
        this.maxUnterdeckung = deckung;
    }

    public BankKonto(float wert, float zinssatz, float deckung, String person) {
        this.kontoStand = wert;
        this.aktZinssatz = zinssatz;
        this.maxUnterdeckung = deckung;
        this.besitzer = person;
    }

    public void zeigeKontoInfo() {
        System.out.println("kontoStand = " + kontoStand);
        System.out.println("aktZinssatz = " + aktZinssatz);
        System.out.println("maxUnterdeckung = " + maxUnterdeckung);
        System.out.println("besitzer = " + besitzer);
    }

    public static void main(String[] args) {
        BankKonto kontoLeer;
        BankKonto kontoX;
        BankKonto kontoMoritz;

        kontoLeer = new BankKonto();
        kontoX = new BankKonto(1000, 5);
        kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");

        System.out.println("kontoLeer");
        kontoLeer.zeigeKontoInfo();
        System.out.println();

        System.out.println("kontoX");
        kontoX.zeigeKontoInfo();
        System.out.println();

        System.out.println("kontoMoritz");
        kontoMoritz.zeigeKontoInfo();
    }
}
