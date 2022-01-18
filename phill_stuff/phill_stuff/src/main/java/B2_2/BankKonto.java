package B2_2;

public class BankKonto {
    private float kontostand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    public static void main(String[] args) {
        BankKonto kontoleer;
        BankKonto kontoX;
        BankKonto kontoMoritz;

        kontoleer = new BankKonto();
        kontoX = new BankKonto(1000, 5);
        kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");

        kontoleer.zeigeKontoInfo();
        kontoX.zeigeKontoInfo();
        kontoMoritz.zeigeKontoInfo();
    }

    public BankKonto(){

    }

    public BankKonto(float kontostand) {
        this.kontostand = kontostand;
    }

    public BankKonto(float kontostand, float aktZinssatz) {
        this.kontostand = kontostand;
        this.aktZinssatz = aktZinssatz;
    }

    public BankKonto(float kontostand, float aktZinssatz, float maxUnterdeckung) {
        this.kontostand = kontostand;
        this.aktZinssatz = aktZinssatz;
        this.maxUnterdeckung = maxUnterdeckung;
    }

    public BankKonto(float kontostand, float aktZinssatz, float maxUnterdeckung, String besitzer) {
        this.kontostand = kontostand;
        this.aktZinssatz = aktZinssatz;
        this.maxUnterdeckung = maxUnterdeckung;
        this.besitzer = besitzer;
    }

    public void zeigeKontoInfo(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Besitzer : " + besitzer);
        System.out.println("Kontostand : " + kontostand);
        System.out.println("Zinssatz : " + aktZinssatz);
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
}
