package B2_2;

public class BankKonto {
    private float kontostand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    public BankKonto() {
        kontostand = 0.0f;
        aktZinssatz = 0.0f;
        maxUnterdeckung = 0.0f;
        besitzer = null;
    }

    public BankKonto(float wert) {
        this.kontostand = wert;
    }

    public BankKonto(float wert, float zinssatz) {
        this.kontostand = wert;
        this.aktZinssatz = zinssatz;
    }

    public BankKonto(float wert, float zinssatz, float deckung) {
        this.kontostand = wert;
        this.aktZinssatz = zinssatz;
        this.maxUnterdeckung = deckung;
    }

    public BankKonto(float wert, float zinssatz, float deckung, String person) {
        this.kontostand = wert;
        this.aktZinssatz = zinssatz;
        this.maxUnterdeckung = deckung;
        this.besitzer = person;
    }

    public void zeigeKontoInfo() {
        System.out.println("kontostand = " + kontostand);
        System.out.println("aktZinssatz = " + aktZinssatz);
        System.out.println("maxUnterdeckung = " + maxUnterdeckung);
        System.out.println("Besitzer = " + besitzer);
    }

    public static void main(String[] args) {
        BankKonto kontoLeer = new BankKonto();
        BankKonto kontoX = new BankKonto(1000, 5);
        BankKonto kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");

        System.out.println("---------kontoLeer--------");
        kontoLeer.zeigeKontoInfo();
        System.out.println("---------kontoX-----------");
        kontoX.zeigeKontoInfo();
        System.out.println("---------kontoMoritz------");
        kontoMoritz.zeigeKontoInfo();
        System.out.println("--------------------------");
    }

    //Vorteil von kaskadierten Konstruktoren
    //Es vereinfacht es, die Objekte zu erstellen. Da man immer die Kontruktor hat, der passt;
}
