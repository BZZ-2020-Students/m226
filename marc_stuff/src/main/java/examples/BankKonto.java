package examples;

public class BankKonto {
    private float kontostand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    public BankKonto() {
        this(0, 0, 0, null);
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

    public void printInfo() {
        System.out.println("-".repeat(25));
        System.out.println("Besitzer     : " + besitzer);
        System.out.println("Kontostand   : " + kontostand);
        System.out.println("Zinssatz     : " + aktZinssatz);
        System.out.println("Unterdeckung : " + maxUnterdeckung);
    }

    public static void main(String[] args) {
        BankKonto konotoLeer, kontoX, kontoMoritz;
        konotoLeer = new BankKonto();
        kontoX = new BankKonto(1000, 5);
        kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");

        konotoLeer.printInfo();
        kontoX.printInfo();
        kontoMoritz.printInfo();
    }
}
