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

    public float getKontostand() {
        return kontostand;
    }

    public void setKontostand(float kontostand) {
        this.kontostand = kontostand;
    }

    public float getAktZinssatz() {
        return aktZinssatz;
    }

    public void setAktZinssatz(float aktZinssatz) {
        this.aktZinssatz = aktZinssatz;
    }

    public float getMaxUnterdeckung() {
        return maxUnterdeckung;
    }

    public void setMaxUnterdeckung(float maxUnterdeckung) {
        this.maxUnterdeckung = maxUnterdeckung;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
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
